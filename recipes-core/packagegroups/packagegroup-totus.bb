#
# Copyright (c) 2015 C. Brett Witherspoon
#

SUMMARY = "Base utility packages"
LICENSE = "MIT"

PR = "r1"

inherit packagegroup

PACKAGES = "\
    packagegroup-totus-utils \
    "

RDEPENDS_packagegroup-totus-utils = "\
    bash \
    acl \
    attr \
    bc \
    coreutils \
    cpio \
    ed \
    file \
    findutils \
    gawk \
    grep \
    mktemp \
    mtd-utils \
    ncurses \
    procps \
    psmisc \
    sed \
    tar \
    time \
    util-linux \
    bzip2 \
    gzip \
    unzip \
    zip \
    less \
    wget \
    iproute2 \
    iputils \
    "

