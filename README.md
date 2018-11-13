# REST-API for me-edge based dataset 

## Overview
Users of social media can create different accounts in multiple social websites such as social networks sites(Facebook and LinkedIn), 
review sites (Amazon), content communities (YouTube and Instagram) and so on. Different social media categories are modelled in this project with three types of relationship: FB_FriendOf (Facebook friendship), TW_FriendOf (Twitter followingship considered as friendship relation  as the user chooses to be friend with users) and Me_Edge relationship (link between two accounts of the same user in different social media websites). 
In order to readily explore the proposed dataset as it is composed of huge number of users, this application defines a set of services accessible through REST endpoints.

## Used Versions
- Spring Boot - 1.5.17.RELEASE
- Neo4j Bolt Driver - 2.1.1
## REST endpoints
> - `/rest/dataset/facebook/users` - returns all Facebook users stored in the dataset and it is possible to specify the number of returned users
> - `/rest/dataset/facebook/friendsOf?idFbProfile={idFbProfile}` - returns the list of friends of a given Facebook user by specifying his id as input ({idFbProfile})
> - `/rest/dataset/twitter/users` - returns all Twitter users stored in the dataset and it is possible also to specify the number of returned users
> - `/rest/dataset/twitter/friendsOf?idTwProfile={idTwProfile}` - returns the list of friends of a given Twitter user by specifying his id as input ({idTwProfile})
> - `/rest/dataset/AllMeEdges` -returns all Me Edges in the dataset which are a number of `12 928` meedges
> - `/rest/dataset/twitter/Me_EdgesOf?idTwProfile={idTwProfile}` - returns other accounts on other social media websites of the Twitter user specified by his id ({idTwProfile})
> - `/rest/dataset/facebook/Me_EdgesOf?idFbProfile={idFbProfile}` - returns other accounts on other social media websites of the Twitter user specified by his id ({idFbProfile})
> - `/rest/dataset/twitter/FbTwBridges` - returns a couple of Twitter and Facebook accounts pertaining to the same user and they are a number of `25 546` acounts
> - `/rest/dataset/TumblrBridges` - returns Twitter accounts with their corresponding Tumblr accounts
## How to run
1. Install Neo4j community version from [Neo4j website](https://neo4j.com/download/)
2. Import the dataset into neo4j (google driver link)
3. Download the [project](https://github.com/amaraamina/MeEdgeBasedDataset-REST-API) and unzip it
4. Open the project on [IntelliJ Idea](https://www.jetbrains.com/idea/download/#section=windows) and modify the file `/src/main/resources/application.properties` by setting up the following parameters:
 ```
 server.port=8081
 spring.data.neo4j.uri=bolt://localhost
 spring.data.neo4j.username=neo4j
 spring.data.neo4j.password=password
 ```
5. If ready, you can test all the mentionned endpoints to explore the dataset






