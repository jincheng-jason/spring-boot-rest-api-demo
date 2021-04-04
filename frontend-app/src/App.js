// App.js

import React, { useMemo, useState, useEffect } from "react";

import Table from "./Table";
import "./App.css";
import axios from "axios";

function App() {
  // data state to store the TV Maze API data. Its initial value is an empty array
  const [data, setData] = useState([]);

  // Using useEffect to call the API once mounted and set the data
  useEffect(() => {
    (async () => {
      const result = await axios("http://localhost:8080/v1.0/api/posts", {crossOrigin: true});
      setData(result.data);
    })();
  }, []);

  const columns = useMemo(
      () => [
        {
          Header: "Title",
          accessor: "title"
        },
        {
          Header: "Body",
          accessor: "body"
        }
      ]
  );

  return (
      <div className="App">
          <Table columns={columns} data={data} />
      </div>
  );
}

export default App;