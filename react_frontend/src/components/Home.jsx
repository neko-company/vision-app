import React from "react";
import { Container, Typography } from "@mui/material";

function Home() {
  return (
    <Container maxWidth="lg" sx={{ backgroundColor: "#fff", padding: 4, minHeight: "80vh" }}>
      <Typography variant="h4" gutterBottom>
        Welcome to Vision App!
      </Typography>
      <Typography>
        This is the starting point for your Material-UI-based React application.
      </Typography>
    </Container>
  );
}

export default Home;
