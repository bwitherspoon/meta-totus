Totus
=====

This layer depends on:

* URI: git://git.yoctoproject.org/poky
* branch: thud

Setup
-----

    git clone -b thud git://git.yoctoproject.org/poky
    git clone -b thud https://github.com/bwitherspoon/meta-totus.git
    source ./oe-init-build-env totus-build
    bitbake-layers add-layer ../meta-totus

Set DISTRO and MACHINE in local.conf.

Build
-----

    bitbake core-image-base
    bitbake dosfstools-native mtools-native parted-native
    wic create sdimage-bootpart -e core-image-base
    dd if=<image> of=<device> bs=4M conv=sync
    sync

Modify
------

    sudo kpartx -a <image>
    sudo mount /dev/mapper/loop0p1 /mnt/boot
    sudo mount /dev/mapper/loop0p2 /mnt/root
