import http from "../http-common";

class PrimeNumberService {
  

  create(data) {
    return http.post("/primenumbers/"+data, {data});
  }
}

export default new PrimeNumberService();