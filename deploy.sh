#!/usr/bin/env bash

#current date time
current=`date "+%Y%m%d%H%M%S"`

echo "set version"
mvn versions:set -DnewVersion=${current}

echo "sleep 3s"
sleep 3

echo "commit version"
mvn versions:commit

echo "sleep 3s"
sleep 3

echo "deploy to oss"

mvn clean deploy -P release -Dgpg.passphrase=12345678