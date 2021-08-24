## ShowArticles
ShowArticles is a demo application that uses MVVM pattern and Android Jetpack: the Pagging 3 library with a backend API, Saved State module for ViewModel, LiveData, ViewBinding, Dagger-Hilt and Navigations Components. The app fetches data from the network with use of Retrofit integrating persisted data in the database via repository pattern. The app also uses and Kotlin Coroutines + Flow. Newsster provides translated text for the other languages, support for a landscape orientation and a night mode.

## Tech stack & Open-source libraries
# Jetpack Library
Paging 3 sets up a Repository that will use the local database to page in data for the UI and also back-fill the database from the network as the user reaches to the end of the data in the database.
Room Persistence - Access app's SQLite database with in-app objects and compile-time checks.
ViewBinding - allows to more easily write code that interacts with views and replaces findViewById.
ViewModel - UI related data holder, lifecycle aware.
Saved State module for ViewModel data that survives background process restart.
Lifecycles - Create a UI that automatically responds to lifecycle events.
LiveData - Build data objects that notify views when the underlying database changes.
SafeArgs for navigating and passing data between fragments.
Navigation - Handle everything needed for in-app navigation.
Room - Access app's SQLite database with in-app objects and compile-time checks.
Dagger-Hilt for dependency injection. Object creation and scoping is handled by Hilt.
