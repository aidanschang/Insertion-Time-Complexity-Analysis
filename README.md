# Insertion Time Complexity Experiment

## Overview
This project is designed to demonstrate both insertions and search time complexity of HashMap, ArrayList, and LinkedList data structures. The purpose of this project is to further understand the importance of choosing the right data structure and practice of constructing, inserting, and searching within each data structure. 

<img width="462" alt="Screen Shot 2022-01-17 at 7 35 06 PM" src="https://user-images.githubusercontent.com/84875731/149869607-9e179f77-7d74-4b4c-aa76-e0e4782a2b89.png">

## Implementation
Each of the data structures was given 100,000 random integers ranging from 0(inclusive) to 1 million(exclusive) to calculate the duration each data structure took to complete their insertions. On the other hand, each data structure will be searched for 100,000 random integers ranging from 0(inclusive) to 2 million (exclusive) and calculate the duration each data structure took.

<img width="400" alt="Screen Shot 2022-01-17 at 8 13 12 PM" src="https://user-images.githubusercontent.com/84875731/149869890-8a1e36ee-1e1c-4ae4-b24b-f29da106ca7f.png">

This program then repeats each insertion and searching for 10 times and calculated their average insertion and searching time as shown above.

## Observation
1. When comparing ArrayList and LinkedList, although both ArrayList and LinkedList are both O(n) at searching and O(1) at adding, ArrayList performs better at searching because ArrayList implements a RandomAccess Interface which provides capabilities of random retrievals while LinkedList does not implement any marker interface but is better at insertion and deletion due to that fact that steps are simpler.

2. HashMap has both adding and searching with O(1) time complexity. Despite its advantages, the drawbacks are pronounced when n is large as the hash function cannot create unique hashcodes to each element. In that instance, a custom hash function can be created to guarantee each element has its own unique hashcodes. 

Reference: https://stackoverflow.com/questions/1757363/java-hashmap-performance-optimization-alternative 
