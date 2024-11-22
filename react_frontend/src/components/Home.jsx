import React from "react";
import { Container, Typography } from "@mui/material";
import HelloWorld from "./HelloWorld";

function Home() {
  return (
    <Container maxWidth="lg" sx={{ backgroundColor: "#fff", padding: 4, minHeight: "80vh" }}>
      <Typography variant="h4" gutterBottom>
        <HelloWorld/>
      </Typography>
      <Typography>
        This is the Home page, it will display the highlights of this site.
      </Typography>
    </Container>
  );
}

export default Home;
