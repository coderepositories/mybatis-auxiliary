#!/usr/bin/env bash
echo "set version"
mvn versions:set -DnewVersion=1.0.0-SNAPSHOT

echo "deploy to oss"
mvn clean deploy -P release -Dgpg.passphrase=12345678