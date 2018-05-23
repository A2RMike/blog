"use strict"

angular.module("app")
    .controller("postDetailsController", ["$scope", "$stateParams", "Posts",
        function ($scope, $stateParams, Posts) {

            $scope.post = {};

            //PAGE LOAD
            function init() {
                var id = $stateParams.id;

                Posts.getByID(id).then(function (resp) {
                    $scope.post = resp.data;
                }).catch(function (err) {
                    console.log(err);
                });

            }


            init();
        }]);