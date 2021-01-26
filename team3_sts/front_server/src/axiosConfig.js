import axios from 'axios';

export default axios.create({
    baseURL: 'api',
    timeout: 1000,
    headers: {
        "Accept": "application/json",
        "Content-Type": "application/json"
    }
})