// App.js

import React from "react";
import { BrowserRouter as Router,Route} from 'react-router-dom';

import "./App.css";
import Posts from "./components/posts";
import Comments from "./components/comments";

function App() {

  return (
      <div className="App">
          <Router>
              <div>
                  <Route path="/" component={Posts} exact />
                  <Route path="/posts" component={Posts} />
                  <Route path="/comments" component={Comments} />
              </div>
          </Router>
      </div>
  );
}

export default App;