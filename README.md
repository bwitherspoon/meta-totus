Totus
=====

This layer depends on:

* URI: git://github.com/openembedded/oe-core.git
* branch: krogoth
* revision: HEAD

Setup
-----

    git clone -b krogoth git://git.yoctoproject.org/poky
    cd poky
    git clone -b krogoth https://github.com/bwitherspoon/meta-totus.git
    TEMPLATECONF=$(pwd)/meta-totus/conf source ./oe-init-build-env
    export MACHINE=<machine>

Build
-----

    bitbake totus-image
    bitbake dosfstools-native mtools-native parted-native
    wic create sdimage-bootpart -e totus-image
    dd if=<image> of=<device>
    sync

Modify
------

    sudo kpartx -a <image>
    sudo mount /dev/mapper/loop0p1 /mnt/boot
    sudo mount /dev/mapper/loop0p2 /mnt/root

