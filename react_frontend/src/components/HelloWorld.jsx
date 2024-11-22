import React, { useState, useEffect } from "react";
import api from './../api';

const HelloWorld = () => {
    const [message, setMessage] = useState("");

    useEffect(() => {

        api.get('/hello')
            .then((response) => response.data)
            .then((data) => setMessage(data))
            .catch((error) => console.error("Error fetching message:", error));
    }, []);

    return (
        <div>
            {message || "Loading..."}
        </div>
    );
};

export default HelloWorld;
