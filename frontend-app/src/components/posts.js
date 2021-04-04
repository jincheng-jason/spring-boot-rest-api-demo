import React, { Component } from "react";
import Table from "./Table";

export default class Posts extends Component {

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
        const apiUrl = "http://localhost:8080/v1.0/api/posts";
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
                                accessor: "id"
                            },
                            {
                                Header: "Post Title",
                                accessor: "title"
                            },
                            {
                                Header: "Post Body",
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