package bq.def;
/*
 * Copyright (C) 2024 THL A29 Limited, a Tencent company.
 * BQLOG is licensed under the Apache License, Version 2.0.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

import java.util.AbstractMap.SimpleEntry;

public class constants {
	public static final int size_of_uint32 = 4;
	public static final int size_of_uint64 = 8;
	
	public static final Class<?> cls_param_wrapper = new SimpleEntry<int[], long[]>(new int[1], new long[2]).getClass();
}
