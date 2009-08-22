/*
 * $Id: Device.java 4973 2009-02-02 07:52:47Z lsantha $
 *
 * Copyright (C) 2003-2009 JNode.org
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public 
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; If not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
 
package org.jnode.driver;

import org.jnode.driver.block.BlockDevice;


/**
 * A software representation of a hardware device.
 * <p/>
 * Every device is controlled by a Driver. These drivers are found by DeviceToDriverMapper
 * instances.
 *
 * @author Ewout Prangsma (epr@users.sourceforge.net)
 * @see org.jnode.driver.Driver
 * @see org.jnode.driver.DeviceToDriverMapper
 */
public interface Device {
    

    /**
     * Gets the implementation of a given API.
     *
     * @param apiInterface
     * @return The api implementation (guaranteed not null)
     */
    public BlockDevice getAPI();

}