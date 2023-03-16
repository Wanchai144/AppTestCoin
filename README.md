# AppTestCoin


**Communication between layers**

1.UI calls method from ViewModel.     

2.ViewModel executes Use case.

3.Use case combines data from Album and Photo Repositories.

4.Each Repository returns data from a Data Source (Cached or Remote).

5.Information flows back to the UI where we display the list of posts.

Database 

Rest api , realm database 

**Architecture**

MVVM  Clean Architecture 

**Dependency Injection**

Koin

**Threading**

Coroutines
