# REST-API for BUNet dataset 

## Overview
<p align="justify"> Users of social media can create different accounts in multiple social websites such as social networks sites (Facebook and LinkedIn), 
review sites (Amazon), content communities (YouTube and Instagram) and so on. Different social media categories are modelled in this project with three types of relationship: FB_FriendOf (Facebook friendship), TW_FriendOf (Twitter followingship considered as friendship relation as the user chooses to be friend with users) and Me_Edge relationship (link between two accounts of the same user in different social media websites). 
In order to readily explore the huge BUNet dataset, available on **(google driver link)**, this application defines a set of services accessible through REST endpoints.</p>

## Used Versions
- Spring Boot - 1.5.17.RELEASE
- Neo4j Bolt Driver - 2.1.1
## REST API reference
The REST API is mainly composed of two types of services: elementary services and complex services. 
### Elementary services
1. **Nodes information retrieving**  
 - **fbUser**   
 An fbUser represents a person on Facebook. The _/fbUser?idFbProfile={id}_ node returns a single user.
   ###### **Example**  
   > http://localhost:8081/rest/BUNet/fbUser?idFbProfile=5716693
   ###### **Output**
   > <img src="https://user-images.githubusercontent.com/17149853/49281806-cd7eb780-f48d-11e8-9c8b-693e46d2706c.JPG" width="500">
 
   ###### **Fields**
     | Field| Description |
     | --- | --- |
     | idFbProfile | represents Facebook user ID |
     | name | The Facebook user name |
     | urlFriendsList | The url mapping to user's friends list|
     | urlProfile | describes the user URL profile |
     | friendsNumber | represents the number of friends the user has|
     | location| the actual location of the user |

   It is,also , possible to return a collection of Facebook users through the _/fbUsers?limit={limit}_ node and if any {limit}   parameter is entered it will take the default value which is egal to 100. 
- **twUser**  
 A twUser represents a person on Twitter. The _/twUser?idTwProfile={id}_ node returns a single user.
  ###### **Example**
  >  http://localhost:8081/rest/BUNet/twUser?idTwProfile=123
  ###### **Output**
  >  <img src="https://user-images.githubusercontent.com/17149853/49282718-27807c80-f490-11e8-9eb1-2bb05a07dfb2.JPG" width="500">
    
  ###### **Fields**
     | Field| Description |
     | --- | --- |
     | idTwProfile | represents Twitter user ID|
     | name | The Twitter user name|
     | twFollowersNumber | represents the number of Twitter user's Followers|
     | twFriendsNumber | describes the number of followingships that a given Twitter user has|
     
   API's users are able to return a collection of Twitter users through the _/twUsers?limit={limit}_ node and if any {limit}   parameter is entered it will take the default value which is set to 100. 
2. **Edge information retrieving**  
  - **fbFriendsOf**    
    <p align="justify">An fbFriendsOf represents a collection of friends of a given Facebook user. The _/fbFriendsOf?idFbProfile={id}_ node returns a collection of Facebook users who are friends with the Facebook profile having the idFbProfile equal to the input ID ({id}).</p>   
   ###### **Example**
   > http://localhost:8081/rest/BUNet/fbFriendsOf?idFbProfile=123
   
 - **fbMe_EdgesOf**  
    <p align="justify">An fbMe_EdgesOf describes a Twitter account of a given Facebook user. the _/fbMe_EdgesOf?idFbProfile={idFbProfile}_ node returns the corresponding Twitter account of a given Facebook user. </p>
  ###### **Example**
  > http://localhost:8081/rest/BUNet/fbMe_EdgesOf?idFbProfile=123

 - **twFriendsOf**  
    <p align="justify">An twFriendsOf represents a collection of following users that a given Twitter user has and they are classified as friends as the user chooses to follow them. The _/twFriendsOf?idTwProfile={id}_ node returns a collection of Twitter users that the given user, having the idTwProfile equal to the input ID ({id}), chooses to follow them. </p>
  ###### **Example**  
  > http://localhost:8081/rest/BUNet/twFriendsOf?idTwProfile=123
 - **twMe_EdgesOf**  
    <p align="justify">An twMe_EdgesOf describes a collection of accounts in other social media websites of a given Twitter user. The _/twMe_EdgesOf?idTwProfile={idTwProfile}_ node returns me-edges of a given Twitter account. </p>
  ###### **Example**
  > http://localhost:8081/rest/BUNet/twMe_EdgesOf?idTwProfile=123
- **SMBridges**  
    <p align="justify">A SMBridges represents a collection of me-edges in a given social media website. The _/SMBridges?name={name}_ node returns the set of me-edges to the {name} social media website.</p>
  ###### **Example**
  > http://localhost:8081/rest/BUNet/SMBridges?name=youtube
- **FbTwMeEdges**  
    <p align="justify">An FbTwMeEdges describes the set of me-edges between Facebook and Twitter social networks.The _/FbTwMeEdges?limit={limit}_ node returns a number of {limit} me-edges links between Facebook and Twitter. </p>
  ###### **Example**
  > http://localhost:8081/rest/BUNet/FbTwMeEdges?limit=100
- **AllMeEdges**  
    <p align="justify">An AllMeEdges describes the whole set of stored me-edges into the BUNet dataset. These me-edges are a number of 12 928 links and the API user can choose to get a limit number of these links.The _/AllMeEdges?limit={limit}_ node returns a number of {limit} me-edges links. </p>
  ###### **Example**
  > http://localhost:8081/rest/BUNet/AllMeEdges?limit=100    
### Complex Services  
1. **Graph Algorithms**  
- _Degree Centrality_:  
    <p align="justify">This algorithm is applied to the BUNet dataset to get the list of nodes and their degrees, indegrees, and outdegrees ordered by their degrees to get the maximum connected nodes at first. The _/graphProperties/Degree?limit={limit}_ node returns a set of nodes with their degrees and it is possible to select the number of returned nodes. </p>
  >`Example: http://localhost:8081/rest/BUNet/graphProperties/Degree?limit=100`
- _PageRank Centrality_:
    <p align="justify">This algorithm measures the connectivity of nodes. The output will be a collection of users' name, the social network of the returned user, and his pageRank score. The _/graphProperties/PageRank?limit={limit}_ node returns a set of nodes with their pageRank scores. </p>
  >`Example: http://localhost:8081/rest/BUNet/graphProperties/PageRank?limit=100`
- _Betweenness Centrality_: 
    <p align="justify">Betweenness centrality calculates the amount of influence a node has over a graph based on shortest paths. The output is a set of users with their betweenness scores. These values are measured based on different types of relationships that exist between users and the API customer has to specify the list of relationships to be considered when calculating the betweenness centrality of nodes. The _/graphProperties/Betweenness?relationships={relationships}&limit={limit}_ node returns a collection of users with their betweenness scores. </p>
  > `Example: http://localhost:8081/rest/BUNet/graphProperties/Betweenness?limit=100& relationships=TW_FriendOf&relationships=Me_Edge`
- _Closeness Centrality_:
    <p align="justify">Closeness centrality measures the average distance from a node to other nodes. This algorithm detects nodes which are able to effeciently spread information through a graph. This algorithm is applied on the BUNet dataset by specifying the relationship types as input to the endpoint. The _/graphProperties/Closeness?relationships={relationships}&limit={limit}_ node returns a set of nodes with their closeness scores.</p>
  > `Example: http://localhost:8081/rest/BUNet/graphProperties/Closeness?limit=100& relationships=TW_FriendOf`
 
2. **BUNet Statistics**  
    <p align="justify">BUNet API is, also, provided by a service to get statistics about the dataset. These statistics are available through the _/statistics_ endpoint. </p>
       > `Example: http://localhost:8081/rest/BUNet/statistics`  

The following figure describes in more details the architecture of the project and it shows the different interactions between the project's packages.

<p align="center"><img src="https://user-images.githubusercontent.com/17149853/49279918-0bc5a800-f489-11e8-8950-ea2c92f52030.JPG" width="900"></p>

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





