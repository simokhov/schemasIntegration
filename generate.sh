#!/bin/bash

#Get version
VERSION="$1"
if [ -z "$VERSION" ] 
then
echo "Usage : ./generate.sh version"
exit
fi


# generate schema classes
xjc -d src/main/java *.xsd

# commit git and make tag
git add -A
git commit -am $VERSION
git tag -a v$VERSION -m "INTEGRATION VSRZ v.$VERSION"
git push origin v$VERSION
git push 

#deploy to bintray
mvn deploy -Dversion=$VERSION
