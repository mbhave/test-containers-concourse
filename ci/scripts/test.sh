#!/bin/bash
set -e

pushd git-repo > /dev/null
	./mvnw test
popd > /dev/null
