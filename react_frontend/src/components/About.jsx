import React from "react";
import { Container, Typography } from "@mui/material";

function About() {
  return (
    <Container maxWidth="lg" sx={{ backgroundColor: "#fff", padding: 4, minHeight: "80vh" }}>
      <Typography variant="h4" gutterBottom>
        About Vision App
      </Typography>
      <Typography>
        This page provides details about Vision App.
      </Typography>
    </Container>
  );
}

export default About;
