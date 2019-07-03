package liubo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test1 {

    private  Logger LOGGER = LoggerFactory.getLogger(Test1.class);
//
//    private List<VoucherExtendDTO> exportVoucherList(VoucherRequestDTO voucherRequestDTO) throws InterruptedException {
//        int pageSize = 500;
//        PageInfo pageInfo = new PageInfo();
//        pageInfo.setPageNum(1);
//        pageInfo.setPageSize(pageSize);
//        ResultDTO<PageInfo<VoucherExtendDTO>> pageInfo1 = promotionVoucherApi.getVoucherPageList(pageInfo, voucherRequestDTO);
//        List<VoucherExtendDTO> list =  new ArrayList();
//        List<VoucherExtendDTO> promoList = pageInfo1.getData().getList();
//        if (CollectionUtils.isNotEmpty(promoList)) {
//            int poolSize = pageInfo1.getData().getPages();
//            list =  new ArrayList(pageSize*poolSize);
//            if (pageInfo1.getData()!=null) {
//                List<VoucherExtendDTO> voucherDTOList = pageInfo1.getData().getList();
//                for (VoucherExtendDTO voucherDTO : voucherDTOList) {
//                    toDutyDepartStr(voucherDTO);
//                    list.add(voucherDTO);
//                }
//            }
//            if (poolSize>1) {
//                List<CallableTask> listTask = new ArrayList<>();
//                for (int i = 1; i < poolSize; i++) {
//                    PageInfo pageInfoThread = new PageInfo();
//                    pageInfoThread.setPageNum(i + 1);
//                    pageInfoThread.setPageSize(pageSize);
//                    listTask.add(new CallableTask( promotionVoucherApi, voucherRequestDTO, pageInfoThread));
//                }
//                new PromoTask().excuteTask(listTask,list);
//            }
//            return list;
//        }
//        return new ArrayList<>();
//    }
//
//    public static void toDutyDepartStr(VoucherExtendDTO voucherDTO){
//        voucherDTO.setStateName(VoucherEnum.MerchantVoucherStatusEnum.getStateTextByState(voucherDTO.getState()));
//        VoucherEnum.DutyDepartEnum dutyDepartEnum =  VoucherEnum.DutyDepartEnum.getById(voucherDTO.getDutyDepart());
//        if (dutyDepartEnum==null){
//            voucherDTO.setDutyDepart(null == voucherDTO.getDutyDepart() ? StringUtils.EMPTY : voucherDTO.getDutyDepart());
//        }else{
//            voucherDTO.setDutyDepart(dutyDepartEnum.getText());
//        }
//        if(voucherDTO.getState() != VoucherEnum.MerchantVoucherStatusEnum.ALL_USED.getState()){
//            voucherDTO.setUpdateTime(null);
//        }
//    }
//    class CallableTask implements Callable<List<VoucherExtendDTO>> {
//        VoucherForAdminBusinessApi promotionVoucherApi;
//        VoucherRequestDTO voucherRequestDTO;
//        PageInfo pageInfoThread;
//        public CallableTask(VoucherForAdminBusinessApi promotionVoucherApi,VoucherRequestDTO voucherRequestDTO,PageInfo pageInfoThread) {
//            this.promotionVoucherApi = promotionVoucherApi;
//            this.voucherRequestDTO = voucherRequestDTO;
//            this.pageInfoThread = pageInfoThread;
//        }
//
//        @Override
//        public List<VoucherExtendDTO> call() throws Exception {
//            long start = System.currentTimeMillis();
//            ResultDTO<PageInfo<VoucherExtendDTO>> resultDTO = promotionVoucherApi.getVoucherPageList(pageInfoThread, voucherRequestDTO);
//            if (resultDTO.getData()!=null) {
//                List<VoucherExtendDTO> voucherDTOList = resultDTO.getData().getList();
//                for (VoucherExtendDTO voucherDTO : voucherDTOList) {
//                    toDutyDepartStr(voucherDTO);
//                }
//            }
//            LOGGER.info("线程:{},耗时{}",Thread.currentThread().getName(),(System.currentTimeMillis()-start));
//            return resultDTO.getData().getList();
//        }
//    }

    public  void  test(){
        LOGGER.info("测试{}",111);
    }
}
