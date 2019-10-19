# Add a DHCP network configuration for all e* and w* devices

PACKAGECONFIG_append = " networkd resolved"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://90-dhcp-default.network"

do_install_append() {
    install -d ${D}${sysconfdir}/systemd/network/
    install -m 0644 ${WORKDIR}/90-dhcp-default.network ${D}${sysconfdir}/systemd/network
}
