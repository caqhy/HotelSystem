/*
 * Copyright (c) 2019.  黄钰朝
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hyc.www.test;

import com.hyc.www.controller.constant.CtrlConsts;

/**
 * @author <a href="mailto:kobe524348@gmail.com">黄钰朝</a>
 * @program XHotel
 * @description 用于测试常量类
 * @date 2019-04-14 11:32
 */
public class TestConstants {
    public static void main(String[] args) {
        System.out.println(CtrlConsts.Method.REGIST_DO.name());
        System.out.println(CtrlConsts.Method.valueOf("REGIST_DO"));
        System.out.println(CtrlConsts.Method.LOGIN_DO.toString());
        System.out.println(CtrlConsts.Method.LOGIN_DO);
        System.out.println(CtrlConsts.Method.LOGIN_DO.getName());
        for (CtrlConsts.Method ms : CtrlConsts.Method.values()) {
            System.out.println(ms.getName());
            if(ms.getName().equalsIgnoreCase("login.do")){
                System.out.println("find method : "+ms.getName());
            }
        }
    }
}
