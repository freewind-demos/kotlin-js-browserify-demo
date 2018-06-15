Kotlin-js Browserify Demo
==========================

Use browserify to package some npm libs, and use them in Kotlin.

Run:

```
npm install
npm install -g browserify
browserify -r string > deps-bundle.js
./gradlew compileKotlin2Js
open index.html
```

You will see an alert with `he`.



