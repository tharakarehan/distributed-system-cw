package com.tharaka.ds.cw;

import com.tharaka.ds.cw.sycnhronization.DistributedTxListener;
import common.tharaka.ds.cw.communication.grpc.generated.ItemDeleteServiceGrpc;

public class ItemDeleteServiceImpl extends ItemDeleteServiceGrpc.ItemDeleteServiceImplBase implements DistributedTxListener {

    private final ReservationServer reservationServer;
    private final DataProviderImpl dataProvider;
    public ItemDeleteServiceImpl(ReservationServer reservationServer, DataProviderImpl dataProvider) {
        this.reservationServer = reservationServer;
        this.dataProvider = dataProvider;
    }
    @Override
    public void onGlobalCommit() {

    }

    @Override
    public void onGlobalAbort() {

    }
}
