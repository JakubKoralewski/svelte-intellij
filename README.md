<p align="center">
  <img width="320" src="./svelte-intellij-header.png" alt="logo of svelte-intellij repository">
</p>

# svelte-intellij

Support for <a href="https://svelte.dev/">Svelte</a> in your IDE of choice. Works in JetBrains products that support JavaScript.

<b>PLEASE NOTE THAT THIS IS WORK IN PROGRESS</b>

### Installation
* Use official [Plugin Repository](https://plugins.jetbrains.com/plugin/12375-svelte)
* Head over to [releases tab](https://github.com/tomblachut/svelte-intellij/releases), download `.jar` archive and [Install plugin from disk](https://www.jetbrains.com/help/webstorm/managing-plugins.html#install_plugin_from_disk)

<h3>Features</h3>

<ul>
    <li>Syntax highlighting</li>
    <li>Coding assistance</li>
    <li>Navigation from the components to their definition</li>
</ul>


<h3>Known issues</h3>

<ul>
    <li>Component imports are marked as unused</li>
    <li>$ subscriptions aren't recognised properly</li>
    <li>Props completion and validation isn't provided</li>
    <li>...</li>
</ul>

<h3>Support</h3>

This project is run by one person, because I want Svelte to succeed. Please, leave a star and spread the word.

<h3>Contributing</h3>

Contributions are very much welcome! 

IntelliJ Platform runs on JVM, so this can seem like a huge limitation, but don't worry. Kotlin looks a lot like TypeScript. Bigger issue is scarce documentation for their API. I'll write a few words describing it some day.

For now, please report what could be improved. IntelliJ has a huge feature set, I personally don't use everything it has to offer.
