# REST-API for me-edge based dataset 

## Overview
Users of social media can create different accounts in multiple social websites such as social networks sites(Facebook and LinkedIn), 
review sites (Amazon), content communities (YouTube and Instagram) and so on. Different social media categories are modelled in this project with three types of relationship: FB_FriendOf (Facebook friendship), TW_FriendOf (Twitter followingship considered as friendship relation  as the user chooses to be friend with users) and Me_Edge relationship (link between two accounts of the same user in different social media websites). 
In order to readily explore the proposed dataset as it is composed of huge number of users, this application defines a set of services accessible through REST endpoints.

## Used Versions
- Spring Boot - 1.5.17.RELEASE
- Neo4j Bolt Driver - 2.1.1
## REST API reference
### **fbUser** 
 A fbUser represents a person on Facebook. The _/fbUser?idFbProfile={id}_ node returns a single user.
###### **Example**
 > http://localhost:8081/rest/BUNet/fbUser?idFbProfile=123
###### **Fields**
| Field| Description |
| --- | --- |
| idFbProfile | represents Facebook user ID |
| name | The Facebook user name |
| urlFriendsList | The url mapping to user's friends list|
| urlProfile | describes the user URL profile |
| friendsNumber | represents the number of friends the user has|
| location| the actual location of the user |
###### **fbFriendsOf**
A fbFriendsOf represents a collection of friends of a given Facebook user. The _/fbFriendsOf?idFbProfile={id}_ node returns a collection of Facebook users who are friends with the Facebook profile having the idFbProfile equal to the input ID ({id})
###### **Example**
> http://localhost:8081/rest/BUNet/fbFriendsOf?idFbProfile=123
###### **fbMe_EdgesOf**
A fbMe_EdgesOf describes a Twitter account of a given Facebook user. the _/fbMe_EdgesOf?idFbProfile={idFbProfile}_ node returns the corresponding Twitter account of a given Facebook user.
###### **Example**
> http://localhost:8081/rest/BUNet/fbMe_EdgesOf?idFbProfile=123
### **twUser** 
 A twUser represents a person on Twitter. The _/twUser?idTwProfile={id}_ node returns a single user.
###### **Example**
 > http://localhost:8081/rest/BUNet/twUser?idTwProfile=123
###### **Fields**
| Field| Description |
| --- | --- |
| idTwProfile | represents Twitter user ID|
| name | The Twitter user name|
| twFollowersNumber | represents the number of Twitter user's Followers|
| twFriendsNumber | describes the number of followingships that a given Twitter user has|
###### **twFriendsOf**
twFriendsOf represents a collection of following users that a given Twitter user has and they are classified as friends as the user chooses to follow them. The _/twFriendsOf?idTwProfile={id}_ node returns a collection of Twitter users that the given user, having the idTwProfile equal to the input ID ({id}), chooses to follow them.
###### **Example**
> http://localhost:8081/rest/BUNet/twFriendsOf?idTwProfile=123
###### **twMe_EdgesOf**
A twMe_EdgesOf describes a collection of accounts in other social media websites of a given Twitter user. the _/twMe_EdgesOf?idTwProfile={idTwProfile}_ node returns me-edges of a given Twitter account.
###### **Example**
> http://localhost:8081/rest/BUNet/twMe_EdgesOf?idTwProfile=123
### **SMBridges**
A SMBridges represents a collection of me-edges in a given social media website. The _/SMBridges?name={name}_ node returns the set of me-edges to the {name} social media website.
###### **Example**
> http://localhost:8081/rest/BUNet/SMBridges?name=youtube
### **FbTwMeEdges**
An FbTwMeEdges describes the set of me-edges between Facebook and Twitter social networks.The _/FbTwMeEdges?limit={limit}_ node returns a number of {limit} me-edges links between Facebook and Twitter. 
###### **Example**
> http://localhost:8081/rest/BUNet/FbTwMeEdges?limit=100
### **AllMeEdges**
An AllMeEdges describes the whole set of stored me-edges into the BUNet dataset. These me-edges are a number of 12 928 links and the API user can choose to get a limit number of these links.The _/AllMeEdges?limit={limit}_ node returns a number of {limit} me-edges links. 
###### **Example**
> http://localhost:8081/rest/BUNet/AllMeEdges?limit=100
### Graph Manipulation
###### Graph Algorithms
- _Degree Centrality_: This algorithm is applied to the BUNet dataset to get the list of nodes and their degrees, indegrees, and outdegrees ordered by their degrees to get the maximum connected nodes at first. The _/graphProperties/Degree?limit={limit}_ node returns nodes with their degrees and it is possible to select the number of returned nodes.
 `Example: http://localhost:8081/rest/BUNet/graphProperties/Degree?limit=100`
- PageRank Centrality
- Betweenness Centrality
- Closeness Centrality
###### Graph Statistics

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
## Neo4j Browser URL

```
http://localhost:7474/browser/
```





