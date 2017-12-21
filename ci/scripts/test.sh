#!/bin/bash
set -e

pushd git-repo > /dev/null
	./mvn test
popd > /dev/null
