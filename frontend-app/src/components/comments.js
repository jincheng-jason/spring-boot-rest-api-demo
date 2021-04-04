import React, { Component } from "react";
import Table from "./Table";

export default class Comments extends Component {

    constructor(props) {
        super(props);
        this.state = {
            error: null,
            isLoaded: false,
            data: [],
            columns: []
        }
    }

    componentDidMount() {
        const postId = new URLSearchParams(this.props.location.search);
        let apiUrl = "http://localhost:8080/v1.0/api/comments";
        if (postId){
            apiUrl += "?postId=" + postId.get("postId");
        }
        fetch(apiUrl)
            .then(res => res.json())
            .then(
                (result) => {
                    this.setState({
                        isLoaded: true,
                        data: result,
                        columns: [
                            {
                                Header: "Post Id",
                                accessor: "postId"
                            },
                            {
                                Header: "Comment Name",
                                accessor: "name"
                            },
                            {
                                Header: "Comment Email",
                                accessor: "email"
                            },
                            {
                                Header: "Comment Body",
                                accessor: "body"
                            }
                        ]
                    });
                }
            )
    }

    render() {
        const {error, isLoaded, data, columns} = this.state;
        if (error) {
            return <div>Error: {error.message}</div>;
        } else if (!isLoaded) {
            return <div>Loading...</div>;
        } else {
            return (
                <Table columns={columns} data={data} />
            )
        }
    }
}