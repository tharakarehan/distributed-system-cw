package com.tharaka.ds.cw;

import com.tharaka.ds.cw.sycnhronization.DistributedTxListener;
import common.tharaka.ds.cw.communication.grpc.generated.ItemUpdateServiceGrpc;

public class ItemUpdateServiceImpl extends ItemUpdateServiceGrpc.ItemUpdateServiceImplBase implements DistributedTxListener {

    private final ReservationServer reservationServer;
    private final DataProviderImpl dataProvider;
    public ItemUpdateServiceImpl(ReservationServer reservationServer, DataProviderImpl dataProvider) {
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
