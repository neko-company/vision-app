import axios from 'axios';

const api = axios.create({
    baseURL: process.env.REACT_APP_API_URL, // Automatically prepends this URL to all requests
});

// Example: Add an interceptor (optional)
api.interceptors.response.use(
    (response) => response,
    (error) => {
        // Handle errors globally
        console.error('API Error:', error);
        return Promise.reject(error);
    }
);

export default api;
