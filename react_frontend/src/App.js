import React from "react";
import { BrowserRouter as Router, Routes, Route, NavLink } from "react-router-dom";
import { AppBar, Toolbar, Typography, Button, Box } from "@mui/material";
import Home from "./components/Home";
import About from "./components/About";

function App() {
  return (
    <Router>
      
      <AppBar position="static" color="primary">
        <Toolbar>

          {/* Left-Aligned Title and Navigation Links */}
          <Box sx={{ display: 'flex', flexGrow: 1, alignItems: 'center' }}>
          <Typography variant="h6" component={NavLink } to="/" sx={{marginRight: 2, textDecoration: "none", color: "inherit",}}>
              Vision App
            </Typography>
            <Button color="inherit" component={NavLink } to="/" sx={{ textDecoration: "none", '&.active': { fontWeight: 'bold' } }}>Home</Button>
            <Button color="inherit" component={NavLink } to="/about" sx={{ textDecoration: "none", '&.active': { fontWeight: 'bold' } }}>About</Button>
          </Box>

          {/* Right-Aligned Login Placeholder */}
          <Box>
            <Button color="inherit">Login</Button>
          </Box>

        </Toolbar>
      </AppBar>

      {/* Page Content */}
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
      </Routes>

    </Router>
  );
}

export default App;
