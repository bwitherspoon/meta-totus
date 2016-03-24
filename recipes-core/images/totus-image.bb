SUMMARY = "A command line image"

IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_INSTALL = "\
    packagegroup-totus-boot \
    packagegroup-base \
    "

inherit core-image
