##### production jobs models which will be shared between production jobs service and its consumers.

Build:

locally: `./gradlew clean jar publishToMavenLocal`

artifactory: `gradlew clean jar artifactoryPublish`

###### Adding to services:

_build.gradle:_

`implementation('com.esoftsystems:sso-rest-client:1.0.0')`

Each configuration provided by this service uses lazy loading so project has to provide specific dependencies.


#### Checkstyle

Add

```
apply plugin: 'checkstyle'
```

to `build.gradle`.

Then copy `checkstyle.xml` to `config/checkstyle/checkstyle.xml` in your project.

Report will be stored in `build/reports/checkstyle` directory.

Gradle task to run: `check`

#### Code coverage

Add

```
apply plugin: 'jacoco'

jacocoTestReport {
    reports {
        xml.enabled false
        csv.enabled false
        html.destination file("${buildDir}/reports/jacocoHtml")
    }
}
```

to `build.gradle`.

Report will be stored in `/build/reports/jacocoHtml` directory.

Gradle task to run: `jacocoTestReport`
