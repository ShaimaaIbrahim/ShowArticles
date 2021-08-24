# ShowArticles
ShowArticles is a demo application that uses MVVM pattern and Android Jetpack: the Pagging 3 library with a backend API, Saved State module for ViewModel, LiveData, ViewBinding, Dagger-Hilt and Navigations Components. The app fetches data from the network with use of Retrofit integrating persisted data in the database via repository pattern. The app also uses and Kotlin Coroutines + Flow. Newsster provides translated text for the other languages, support for a landscape orientation and a night mode.

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

# Device Testing
* App Navigation Test - Navigation between screens is tested using Espresso UI framework and ActivityScenario for lifecycle state. Hilt provides test version of Repository and automatically generates a new set of components for each test. This is done with use of a CustomTestRunner that uses an Application configured with Hilt. In order to make Espresso aware of network operations UriIdlingResource is registered for UI test.

# Local Unit Testing


# Design
* ShowArticles is built with Material Components for Android.
* The app starts with an asymmetric staggered list of news displayed in the RecyclerView widget. The screen also consists of options menu with category item as an icon in the app bar and setting item that appears in the overflow menu and lets the user switch themes and language. The screen takes the user to the article details with a beautiful collapsing layout.
* The app has dialogs, buttons, menu and progress indicator customized for colors, shapes and typography. All clickable components behave intuitively changing their appearance when they are pressed.
* The app has beautiful colors schemes for day and night modes.
