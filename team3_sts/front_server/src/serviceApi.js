// ㅜㅜ

import API from "./axiosConfig";

const getId = (data, callback, errorCallback) => {
    API.post(`$member/signin`, data)
    .then(callback)
    .catch(errorCallback)
};

const ServiceApi = {
    getId: (data, callback, errorCallback) => getId(data, callback, errorCallback),
}

export default ServiceApi