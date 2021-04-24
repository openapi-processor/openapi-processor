rm -rf ./docs/_
rm -rf ./docs/api
rm -rf ./docs/gradle
rm -rf ./docs/json
rm -rf ./docs/maven
rm -rf ./docs/oap
rm -rf ./docs/samples
rm -rf ./docs/spring
rm -rf ./docs/spring-mvc-sample
rm -rf ./docs/spring-webflux-sample
rm ./docs/*.html
rm ./docs/*.xml

# restore hand-crafted redirect pages
git restore docs/api/index.html
git restore docs/gradle/index.html
git restore docs/json/index.html
git restore docs/maven/index.html
git restore docs/micronaut/index.html
git restore docs/spring/index.html

