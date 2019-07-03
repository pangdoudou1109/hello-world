package liubo;

public class Test2 {
//    PageInfo<VoucherTemplateExtendQueryDTO>  voucherTemplateExtendPageResult =
//            getVoucherExtendVOPageList(null, voucherTemplateExtendQueryDTO, voucherTemplate,
//                    voucherTemplateExtend,servletRequest, response);
//    List<VoucherTemplateExtendQueryDTO> voucherTemplateExtendVOList = null ==
//            voucherTemplateExtendPageResult || CollectionUtils.isEmpty
//            (voucherTemplateExtendPageResult.getList()) ? Lists.newArrayList() :
//            voucherTemplateExtendPageResult.getList();
//
//    //对查询出来的数据进行处理以用于展示
//    List<Map<String, String>> dataMapList = Lists.newArrayList();
//            voucherTemplateExtendVOList.stream().forEach(tempVoucherTemplateExtendVO -> {
//        Map<String, String> dataMap = JSONObject.parseObject
//                (JSONObject.toJSONString(tempVoucherTemplateExtendVO.getVoucherTemplateExtend()),
//                        HashMap.class);
//        VoucherTemplateDTO tempVoucherTemplate =
//                tempVoucherTemplateExtendVO.getVoucherTemplate();
//        dataMap.put("voucherType", tempVoucherTemplate.getVoucherType().toString
//                ());
//        dataMap.put("voucherTypeText", VoucherEnum.VoucherTypeEnum.get
//                (tempVoucherTemplate.getVoucherType()));
//        dataMap.put("moneyInVoucher", tempVoucherTemplate.getMoneyInVoucher
//                ().toString());
//        dataMap.put("receiveType", tempVoucherTemplate.getReceiveType().toString
//                ());
//        dataMap.put("receiveTypeText", VoucherEnum.VoucherReceiveTypeEnum.getText
//                (tempVoucherTemplate.getReceiveType().intValue()));
//        dataMap.put("merchantType", tempVoucherTemplate.getMerchantType().toString
//                ());
//        dataMap.put("merchantTypeText", VoucherEnum.MerchantTypeEnum.getTextByType
//                (tempVoucherTemplate.getMerchantType()));
//        dataMap.put("validDays", tempVoucherTemplate.getValidDays().toString());
//        String dutyDepart = tempVoucherTemplateExtendVO.getVoucherTemplateExtend
//                ().getDutyDepart();
//        dataMap.put("dutyDepart", StringUtils.isBlank(dutyDepart)?
//                StringUtils.EMPTY : VoucherEnum.DutyDepartEnum.getById(dutyDepart).getText());
//
//        dataMap.put("provideTotalCount",
//                tempVoucherTemplateExtendVO.getProvideTotalCount().toString());
//
//        dataMap.put("createTime", DateUtil.date2String
//                (tempVoucherTemplateExtendVO.getVoucherTemplateExtend().getCreateTime(),
//                        DateUtil.PATTERN_STANDARD));
//        dataMap.put("updateTime", DateUtil.date2String
//                (tempVoucherTemplateExtendVO.getVoucherTemplateExtend().getUpdateTime(),
//                        DateUtil.PATTERN_STANDARD));
//        dataMapList.add(dataMap);
//    });
//
//
//
//    ResultDTO<List<VoucherSmsConfigDTO>> voucherSmsConfigDTOResultDTO =
//            voucherTemplateExtendForAdminBusinessApi.getVoucherSmsConfig(branchCode);
//    List<VoucherSmsConfigDTO> voucherSmsConfigDTOList =
//            voucherSmsConfigDTOResultDTO.getData();
//    voucherSmsConfigDTOList = voucherSmsConfigDTOList.stream().filter
//            (voucherSmsConfigDTO -> BigDecimal.valueOf(checkVoucherMoney.longValue()).compareTo
//            (voucherSmsConfigDTO.getMinMoneyForNeedSms()) > 0).collect(Collectors.toList());
//            voucherSmsConfigDTOList.sort((o1, o2) -> o2.getMinMoneyForNeedSms().compareTo
//            (o1.getMinMoneyForNeedSms()));
//
//
//    VocherTemplateSendLimitDTO dto = item.getData();
//        dto.setMonthlySendLimitMoney(dto.getMonthlySendLimitMoney().setScale
//            (0,BigDecimal.ROUND_HALF_DOWN));
//        dto.setMonthlyRemainingSendMoney(dto.getMonthlySendLimitMoney().subtract
//            (dto.getMonthlySendMoney()));
//        dto.setUpdator(StringUtil.isEmpty(dto.getUpdator()) && StringUtil.isEmpty
//                (dto.getCreator())?"admin":dto.getUpdator());
//
//
//    方法入参voucherTemplateIds
//    Set<Long> voucherTemplateIdSet = Arrays.asList(voucherTemplateIds.split
//            (",")).stream()
//            .filter(voucherTemplateIdStr -> StringUtils.isNotBlank
//                    (voucherTemplateIdStr) && NumberUtils.isNumber(voucherTemplateIdStr))
//            .map(voucherTemplateIdStr -> Long.parseLong
//                    (voucherTemplateIdStr)).collect(Collectors.toSet());
//
//
//    List<Long> assignProductIds = req.getAssignProductIds();
//            if(CollectionUtils.isNotEmpty(list) && CollectionUtils.isNotEmpty
//            (assignProductIds)){
//        StringBuilder sb = new StringBuilder();
//        list.forEach(v->{
//            List<Long> resultSkuIds = v.getAssignProductIds();
//            if(CollectionUtils.isNotEmpty(resultSkuIds)){
//                resultSkuIds.forEach(sku->{
//                    if(assignProductIds.contains(sku)){
//                        sb.append("商品id:").append(sku).append("存在于：").append
//                                (v.getTemplateName()).append("中;");
//                    }
//                });
//            }
//        });
//        return this.addError("result",sb);
//    }
}
