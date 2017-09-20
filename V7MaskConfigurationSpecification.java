/*
 * Copyright (c) 2010-2011 Brigham Young University
 * 
 * This file is part of the BYU RapidSmith Tools.
 * 
 * BYU RapidSmith Tools is free software: you may redistribute it 
 * and/or modify it under the terms of the GNU General Public License 
 * as published by the Free Software Foundation, either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * BYU RapidSmith Tools is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * A copy of the GNU General Public License is included with the BYU 
 * RapidSmith Tools. It can be found at doc/gpl2.txt. You may also 
 * get a copy of the license at <http://www.gnu.org/licenses/>.
 * 
 */
package unsw.cse.rsg.essentialBits;

import edu.byu.ece.rapidSmith.bitstreamTools.bitstream.DummySyncData;
import edu.byu.ece.rapidSmith.bitstreamTools.configurationSpecification.AbstractConfigurationSpecification;

/**
 * Configuration specification common between the V5 and V6 families. 
 */
public abstract class V7MaskConfigurationSpecification extends AbstractConfigurationSpecification {
	
    public V7MaskConfigurationSpecification() {
        _dummySyncData = DummySyncData.V5_V6_STANDARD_DUMMY_SYNC_DATA;
        _minorMask = V7_MINOR_MASK;
        _minorBitPos = V7_MINOR_BIT_POS;
        _columnMask = V7_COLUMN_MASK;
        _columnBitPos = V7_COLUMN_BIT_POS;
        _rowMask = V7_ROW_MASK;
        _rowBitPos = V7_ROW_BIT_POS;
        _topBottomMask = V7_TOP_BOTTOM_MASK;
        _topBottomBitPos = V7_TOP_BOTTOM_BIT_POS;
        _blockTypeMask = V7_BLOCK_TYPE_MASK;
        _blockTypeBitPos = V7_BLOCK_TYPE_BIT_POS;
    }
    
	public static final int V7_TOP_BOTTOM_BIT_POS = 22;
	public static final int V7_TOP_BOTTOM_MASK = 0x1 << V7_TOP_BOTTOM_BIT_POS;
	public static final int V7_BLOCK_TYPE_BIT_POS = 23;
	public static final int V7_BLOCK_TYPE_MASK = 0x7 << V7_BLOCK_TYPE_BIT_POS;
	public static final int V7_ROW_BIT_POS = 17;
	public static final int V7_ROW_MASK = 0x1F << V7_ROW_BIT_POS;
	public static final int V7_COLUMN_BIT_POS = 7;
	public static final int V7_COLUMN_MASK = 0x3FF << V7_COLUMN_BIT_POS;
	public static final int V7_MINOR_BIT_POS = 0;
	public static final int V7_MINOR_MASK = 0x7F << V7_MINOR_BIT_POS;
	
}

