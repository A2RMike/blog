"use strict"

angular.module("app")
    .factory("Posts", ["$http", function ($http) {


        return {
            get: function () {
                return $http.get('http://localhost:8080/blog/rest/post');
            },
            getByID: function (id) {
                return $http.get('http://localhost:8080/blog/rest/post/' + id);
            },
            insert: function (post) {
                return $http.insert('http://localhost:8080/blog/rest/post', post);
            }
        };

    }]);