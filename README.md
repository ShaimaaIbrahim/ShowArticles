# ShowArticles
ShowArticles is a demo application that uses MVVM pattern and Android Jetpack: the Pagging 3 library with a backend API, Dagger Hilt 
for ViewModel, LiveData, ViewBinding, Dagger-Hilt and Navigations Components. The app fetches data from the network with use of Retrofit and sow articles using pagination (pagging3 library). The app also uses and Kotlin Coroutines + Flow ,supports  a night mode.

# Tech stack & Open-source libraries
## Jetpack Library

* Paging 3 sets up a Repository that will use the local database to page in data for the UI and also back-fill the database from the network as the user reaches to the end of the data .

* ViewBinding - allows to more easily write code that interacts with views and replaces findViewById.

* ViewModel - UI related data holder, lifecycle aware.

* Lifecycles - Create a UI that automatically responds to lifecycle events.

* LiveData - Build data objects that notify views when the underlying database changes.

* SafeArgs for navigating and passing data between fragments.

* Navigation - Handle everything needed for in-app navigation.

* Dagger-Hilt for dependency injection. Object creation and scoping is handled by Hilt.

## Third party:
* Glide for image loading.
* Kotlin Coroutines + Flow for managing background threads with simplified code and reducing needs for callbacks
* Retrofit2 & OkHttp3 - to make REST requests to the web service integrated.
* Moshi to handle the deserialization of the returned JSON to Kotlin data objects.

## Architecture:
* MVVM Architecture
* Repository pattern

# Testing

## Device Testing
* App Navigation Test - Navigation between screens is tested using Espresso UI framework and ActivityScenario for lifecycle state. Hilt provides test version of Repository and automatically generates a new set of components for each test. This is done with use of a CustomTestRunner that uses an Application configured with Hilt. In order to make Espresso aware of network operations UriIdlingResource is registered for UI test.

## Local Unit Testing
* using juint test for methods and  objects into app using Dagger Hilt testing component

# Design
* ShowArticles is built with Material Components for Android.
* The app starts with an asymmetric staggered list of news displayed in the RecyclerView widget. The screen also consists of icon in the app bar and setting item that appears in the overflow menu and lets the user switch themes . The screen takes the user to the article details with a beautiful collapsing layout.
* The app has buttons, menu and progress indicator customized for colors, shapes and typography. All clickable components behave intuitively changing their appearance when they are pressed.
* The app has beautiful colors schemes for day and night modes.

## Preview

![Screenshot_٢٠٢١٠٨٢٤-١٧٤٤٢١_Movies 1](https://user-images.githubusercontent.com/51680060/130650358-0cf65554-6a20-477e-bda3-b22a19816710.jpg) ![Screenshot_٢٠٢١٠٨٢٤-١٧٤٤٢٩_Movies 1](https://user-images.githubusercontent.com/51680060/130663170-237380f0-d714-4ad1-a805-61478136ffbf.jpg)

![Screenshot_٢٠٢١٠٨٢٤-١٧٥٦٢٤_Movies 1](https://user-images.githubusercontent.com/51680060/130652657-e6e21216-e856-49d7-a4c3-27a127f21d83.jpg)
![Screenshot_٢٠٢١٠٨٢٤-١٧٥٧٢٥_Movies 1](https://user-images.githubusercontent.com/51680060/130653069-95ee4080-8ee6-4733-b337-2f35087bf9d4.jpg)
![Screenshot_٢٠٢١٠٨٢٤-١٧٥٧٤٢_Movies 1](https://user-images.githubusercontent.com/51680060/130651037-fc1a132a-eabb-4940-9961-958ef01f782b.jpg)

