# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS package for Multiple objects detection, tracking and classification from LIDAR scans/point-clouds"
AUTHOR = "Praveen Palanisamy <praveen.palanisamy@outlook.com>"
ROS_AUTHOR = "Praveen Palanisamy <praveen.palanisamy@outlook.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "multi_object_tracking_lidar"
ROS_BPN = "multi_object_tracking_lidar"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    pcl \
    pcl-ros \
    roscpp \
    sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    pcl \
    pcl-ros \
    roscpp \
    sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    pcl \
    pcl-ros \
    roscpp \
    sensor-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/praveen-palanisamy/multi_object_tracking_lidar-release/archive/release/melodic/multi_object_tracking_lidar/1.0.4-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/multi_object_tracking_lidar"
SRC_URI = "git://github.com/praveen-palanisamy/multi_object_tracking_lidar-release;${ROS_BRANCH};protocol=https"
SRCREV = "0e53a117e6f6c4937941bc6b377c234d450396e6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}