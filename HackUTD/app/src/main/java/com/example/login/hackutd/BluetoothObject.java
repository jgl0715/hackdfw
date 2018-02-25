package com.example.login.hackutd;

/**
 * Created by Nhi K luong on 2/24/2018.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

class BluetoothObject {
    String name, address,uuids;
    int state,type,rssi;
    public void setBluetooth_name(String vname){
        name = vname;
    }

    public void setBluetooth_address(String vaddress){
        address = vaddress;
    }
    public void setBluetooth_state(int vstate){
        state = vstate;
    }
    public void setBluetooth_type(int vtype){
        type = vtype;
    }
    //public void setBluetooth_uuids(ParcelUuiid[] vuuids){

        //uuids = vuuids;
    //}
    public void setBluetooth_rssi(int vrssi){
        rssi = vrssi;
    }
}
