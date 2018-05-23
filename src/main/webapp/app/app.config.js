"use strict"

angular.module("app")
    .config([ "$stateProvider", "$urlRouterProvider", 
        function($stateProvider, $urlRouterProvider){
            
            $urlRouterProvider.otherwise("/common/home")

            $stateProvider
                            .state("common",{
                                url: "/common",
                                templateUrl: "/app/view/templates/common.html",
                                controller: "dbController",
                                abstract: true
                            })
                            .state("common.home",{
                                url: "/home",
                                templateUrl: "/app/view/templates/index_body.html",
                                controller: "dbController"
                            })
                            .state("common.details",{
                                url: "/details/:id",
                                templateUrl: "/app/view/templates/dettaglio_post.html",
                                controller: "postDetailsController"
                            })
                            .state("common.insertpost",{
                                url: "/insertpost",
                                templateUrl: "/app/view/templates/crea_post.html",
                                controller: "postInsertController"
                            })
                            .state("common.cDetails",{
                                url: "/categoria/:id",
                                templateUrl: "/app/view/templates/post_x_categoria.html",
                                controller: "categoriaDetailsController"
                            })
                            .state("common.admin",{
                                url: "/admin",
                                templateUrl: "/app/view/templates/admin.html",
                                controller: "dbController"
                            })
        } ]);