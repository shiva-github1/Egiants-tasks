(function (module) {

    var api = function ($http, $q) {

        function uploadUserJson(json) {
            console.log('Uploading User Json');
            var deferred = $q.defer();
            $http.post("api/user", json)
                .then(
                    function (response) {
                        deferred.resolve(response.data);
                    },
                    function (errResponse) {
                       console.error('Error while uploading User json : '+errResponse.data.errorMessage);
                       deferred.reject(errResponse);
                    }
                );
            return deferred.promise;
        }
        
        function uploadJson(json) {
            console.log('Uploading Json');
            var deferred = $q.defer();
            $http.post("api", json)
                .then(
                    function (response) {
                        deferred.resolve(response.data);
                    },
                    function (errResponse) {
                       console.error('Error while uploading json : '+errResponse.data.errorMessage);
                       deferred.reject(errResponse);
                    }
                );
            return deferred.promise;
        }
        
        return {
        	uploadUserJson: uploadUserJson,
        	uploadJson: uploadJson
        };
    	
    };

    module.service("apiService", ['$http', '$q', api]);

}(angular.module("upload")))            