# Insertion Time Complexity Experiment

## Overview
This project is designed to demonstrate both insertion and search's time complexity of HashMap, ArrayList, and LinkedList data structures. The purpose of this project is to further understand the importance of choosing the right data structure and practice of constructing, inserting, and searching within each data structures. 

<img width="462" alt="Screen Shot 2022-01-17 at 7 35 06 PM" src="https://user-images.githubusercontent.com/84875731/149869607-9e179f77-7d74-4b4c-aa76-e0e4782a2b89.png">

## Implementation
Each of the data structure was given 100,000 random integers ranging from 0(inclusive) to 1 million(exclusive) to calculate the duration each data structure took to complete their insertions. On the other hand, each data structures will be searched for 100,000 random integers ranging from 0(inclusive) to 2 millions(exclusive) and calculate the duration each data structures took.

<img width="400" alt="Screen Shot 2022-01-17 at 8 13 12 PM" src="https://user-images.githubusercontent.com/84875731/149869890-8a1e36ee-1e1c-4ae4-b24b-f29da106ca7f.png">

This program then repeats each insertion and searching for 10 times and calculated their average insertion and searching time as shown above.

## Observation
1. Although both ArrayList and LinkedList are both O(n), ArrayList actually implements a RandomAccess Interface which provdies capabilities of random retrivals verses LinkedList do not implents any marker interface.
2. When comparing ArrayList and LinkedList, ArrayList is better at searching while LinkedList is better at insertion and deletion.
3. HashMap is incredibily fast at searching with O(n) time complexity. While HashMap takes more time and memory than ArrayList and LinkedList, it will be faster compares to the rest two for larger values of n. 

