# Add a DHCP network configuration for all eth* devices

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://default.network"

do_install_append() {
    install -d ${D}${sysconfdir}/systemd/network/
    install -m 0644 ${WORKDIR}/default.network ${D}${sysconfdir}/systemd/network
}
