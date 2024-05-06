package com.tharaka.ds.cw;

import com.tharaka.ds.cw.sycnhronization.DistributedTxListener;
import common.tharaka.ds.cw.communication.grpc.generated.ReserveServiceGrpc;

public class ReserveServiceImpl extends ReserveServiceGrpc.ReserveServiceImplBase implements DistributedTxListener {

    private final ReservationServer reservationServer;
    private final DataProviderImpl dataProvider;
    public ReserveServiceImpl(ReservationServer reservationServer, DataProviderImpl dataProvider) {
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
