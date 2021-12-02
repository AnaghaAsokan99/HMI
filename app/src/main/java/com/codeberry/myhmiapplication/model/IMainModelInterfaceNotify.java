package com.codeberry.myhmiapplication.model;

import android.content.Context;

public interface IMainModelInterfaceNotify {

   void notifyServiceConnection();

   void bindExternalService(final Context context);
}
