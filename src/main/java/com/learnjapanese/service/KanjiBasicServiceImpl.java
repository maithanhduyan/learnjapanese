package com.learnjapanese.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.learnjapanese.entity.KanjiBasic;

@Service
public class KanjiBasicServiceImpl implements KanjiBasicService {

    private static final Logger LOG = LoggerFactory.getLogger(KanjiBasic.class.getName());
    List<KanjiBasic> kanjilist = new ArrayList<KanjiBasic>();

    public KanjiBasicServiceImpl() {
	kanjilist.add(new KanjiBasic(1, "一", "Nhất => Số một",1, ""));
	kanjilist.add(new KanjiBasic(2, "〡", "Cổn => sổ",1, ""));
	kanjilist.add(new KanjiBasic(3, "丶", "Chủ => Điểm, chấm",1, ""));
	kanjilist.add(new KanjiBasic(4, "丿", "Phiệt => sổ xiên qua trái",1, ""));
	kanjilist.add(new KanjiBasic(5, "乙", "Ất => Vị trí thứ 2 trong thiên can",1, ""));
	kanjilist.add(new KanjiBasic(6, "亅", "Quyết => sổ có móc",1, ""));
	kanjilist.add(new KanjiBasic(7, "二", "Nhị => số hai",2, ""));
	kanjilist.add(new KanjiBasic(8, "亠", "Đầu => (không có nghĩa)",2, ""));
	kanjilist.add(new KanjiBasic(9, "人", "Nhân (亻) => người",2, ""));
	kanjilist.add(new KanjiBasic(10, "儿", "Nhi => trẻ con",2, ""));
	kanjilist.add(new KanjiBasic(11, "入", "Nhập => vào",2, ""));
	kanjilist.add(new KanjiBasic(12, "八", "Bát => số tám",2, ""));
	kanjilist.add(new KanjiBasic(13, "冂", "Quynh => vùng biên giới xa; hoang địa",2, ""));
	kanjilist.add(new KanjiBasic(14, "冖", "Mịch => trùm khăn lên",2, ""));
	kanjilist.add(new KanjiBasic(15, "冫", "Băng => nước đá",2, ""));
	kanjilist.add(new KanjiBasic(16, "几", "Kỷ => ghế dựa",2, ""));
	kanjilist.add(new KanjiBasic(17, "凵", "Khảm => há miệng",2, ""));
	kanjilist.add(new KanjiBasic(18, "刀", "Đao (刂) => con dao, cây đao (vũ khí)",2, ""));
	kanjilist.add(new KanjiBasic(19, "力", "Lực => sức mạnh",2, ""));
	kanjilist.add(new KanjiBasic(20, "勹", "Bao => bao bọc",2, ""));
	kanjilist.add(new KanjiBasic(21, "匕", "Chuỷ => cái thìa (cái muỗng)",2, ""));
	kanjilist.add(new KanjiBasic(22, "匚", "Phương => tủ đựng",2, ""));
	kanjilist.add(new KanjiBasic(23, "匸", "Hệ => che đậy, giấu giếm",2, ""));
	kanjilist.add(new KanjiBasic(24, "十", "Thập => số mười",2, ""));
	kanjilist.add(new KanjiBasic(25, "卜", "Bốc => xem bói",2, ""));
	kanjilist.add(new KanjiBasic(26, "卩", "Tiết => đốt tre",2, ""));
	kanjilist.add(new KanjiBasic(27, "厂", "Hán, Xưởng => sườn núi, vách đá",2, ""));
	kanjilist.add(new KanjiBasic(28, "厶", "Khư, tư => riêng tư",2, ""));
	kanjilist.add(new KanjiBasic(29, "又", "Hựu => lại nữa, một lần nữa",3, ""));
	kanjilist.add(new KanjiBasic(30, "口", "Khẩu => cái miệng",3, ""));
	kanjilist.add(new KanjiBasic(31, "囗", "Vi => vây quanh",3, ""));
	kanjilist.add(new KanjiBasic(32, "土", "Thổ => đất",3, ""));
	kanjilist.add(new KanjiBasic(33, "士", "Sĩ => kẻ sĩ",3, ""));
	kanjilist.add(new KanjiBasic(34, "夂", "Trĩ => đến ở phía sau",3, ""));
	kanjilist.add(new KanjiBasic(35, "夊", "Truy => đi chậm",3, ""));
	kanjilist.add(new KanjiBasic(36, "夕", "Tịch => đêm tối",3, ""));
	kanjilist.add(new KanjiBasic(37, "大", "Đại => to lớn",3, ""));
	kanjilist.add(new KanjiBasic(38, "女", "Nữ => nữ giới, con gái, đàn bà",3, ""));
	kanjilist.add(new KanjiBasic(39, "子", "Tử => con",3, ""));
	kanjilist.add(new KanjiBasic(40, "宀", "Miên => mái nhà mái che",3, ""));
	kanjilist.add(new KanjiBasic(41, "寸", "Thốn => đơn vị «tấc» (đo chiều dài)",3, ""));
	kanjilist.add(new KanjiBasic(42, "小", "Tiểu => nhỏ bé",3, ""));
	kanjilist.add(new KanjiBasic(43, "尢", "Uông => yếu đuối",3, ""));
	kanjilist.add(new KanjiBasic(44, "尸", "Thi => xác chết, thây ma",3, ""));
	kanjilist.add(new KanjiBasic(45, "屮", "Triệt => mầm non, cỏ non mới mọc",3, ""));
	kanjilist.add(new KanjiBasic(46, "山", "Sơn => núi non",3, ""));
	kanjilist.add(new KanjiBasic(47, "巛", "Xuyên => sông ngòi",3, ""));
	kanjilist.add(new KanjiBasic(48, "工", "Công => người thợ, công việc",3, ""));
	kanjilist.add(new KanjiBasic(49, "己", "Kỷ => bản thân mình",3, ""));
	kanjilist.add(new KanjiBasic(50, "巾", "Cân => cái khăn",3, ""));
	kanjilist.add(new KanjiBasic(51, "干", "Can => thiên can, can dự",3, ""));
	kanjilist.add(new KanjiBasic(51, "幺", "Yêu => nhỏ nhắn",3, ""));
	kanjilist.add(new KanjiBasic(53, "广", "Nghiễm => mái nhà",3, ""));
	kanjilist.add(new KanjiBasic(54, "廴", "Dẫn => bước dài",3, ""));
	kanjilist.add(new KanjiBasic(55, "廾", "Củng => chắp tay",3, ""));
	kanjilist.add(new KanjiBasic(56, "弋", "Dặc => bắn, chiếm lấy",3, ""));
	kanjilist.add(new KanjiBasic(57, "弓", "Cung => cái cung (để bắn tên)",3, ""));
	kanjilist.add(new KanjiBasic(58, "彐", "Kệ => đầu con nhím",3, ""));
	kanjilist.add(new KanjiBasic(59, "彡", "Sam => lông tóc dài",3, ""));
	kanjilist.add(new KanjiBasic(60, "彳", "Xích => bước chân trái",3, ""));
	kanjilist.add(new KanjiBasic(61, "心", "Tâm (忄)=> quả tim, tâm trí, tấm lòng",4, ""));
	kanjilist.add(new KanjiBasic(62, "戈", "Qua => cây qua (một thứ binh khí dài)",4, ""));
	kanjilist.add(new KanjiBasic(63, "戶", "Hộ => cửa một cánh",4, ""));
	kanjilist.add(new KanjiBasic(64, "手", "Thủ (扌)=> tay, thủ môn",3, ""));
	kanjilist.add(new KanjiBasic(65, "支", "Chi => cành nhánh",4, ""));
	kanjilist.add(new KanjiBasic(66, "攴", "Phộc (攵)=> đánh khẽ",4, ""));
	kanjilist.add(new KanjiBasic(67, "文", "Văn => văn vẻ, văn chương, vẻ sáng",4, ""));
	kanjilist.add(new KanjiBasic(68, "斗", "Đẩu => cái đấu để đong",4, ""));
	kanjilist.add(new KanjiBasic(69, "斤", "Cân => cái búa, rìu",4, ""));
	kanjilist.add(new KanjiBasic(70, "方", "Phương => vuông, hình lập phương",4, ""));
	kanjilist.add(new KanjiBasic(71, "无", "Vô => không",4, ""));
	kanjilist.add(new KanjiBasic(72, "日", "Nhật => ngày, mặt trời",4, ""));
	kanjilist.add(new KanjiBasic(73, "曰", "Viết => nói rằng",4, ""));
	kanjilist.add(new KanjiBasic(74, "月", "Nguyệt => tháng, mặt trăng",4, ""));
	kanjilist.add(new KanjiBasic(75, "木", "Mộc => gỗ, cây cối",4, ""));
	kanjilist.add(new KanjiBasic(76, "欠", "Khiếm => khiếm khuyết, thiếu vắng",4, ""));
	kanjilist.add(new KanjiBasic(77, "止", "Chỉ => dừng lại",4, ""));
	kanjilist.add(new KanjiBasic(78, "歹", "Đãi => xấu xa, tệ hạ",4, ""));
	kanjilist.add(new KanjiBasic(79, "殳", "Thù => binh khí dài",4, ""));
	kanjilist.add(new KanjiBasic(80, "毋", "Vô => chớ, đừng",4, ""));
	kanjilist.add(new KanjiBasic(81, "比", "Tỷ => so sánh",4, ""));
	kanjilist.add(new KanjiBasic(82, "毛", "Mao => lông",4, ""));
	kanjilist.add(new KanjiBasic(83, "氏", "Thị => họ",4, ""));
	kanjilist.add(new KanjiBasic(84, "气", "Khí => hơi nước",4, ""));
	kanjilist.add(new KanjiBasic(85, "水", "Thuỷ (氵)=> nước",4, ""));
	kanjilist.add(new KanjiBasic(86, "火", "Hỏa (灬)=> lửa",4, ""));
	kanjilist.add(new KanjiBasic(87, "爪", "Trảo => móng vuốt cầm thú",4, ""));
	kanjilist.add(new KanjiBasic(88, "父", "Phụ => cha",4, ""));
	kanjilist.add(new KanjiBasic(89, "爻", "Hào => hào âm, hào dương (Kinh Dịch)",4, ""));
	kanjilist.add(new KanjiBasic(90, "爿", "Tường (丬)=> mảnh gỗ, cái giường",4, ""));
	kanjilist.add(new KanjiBasic(91, "片", "Phiến => mảnh, tấm, miếng",4, ""));
	kanjilist.add(new KanjiBasic(92, "牙", "Nha => răng",4, ""));
	kanjilist.add(new KanjiBasic(93, "牛", "Ngưu ( 牜)=> trâu",4, ""));
	kanjilist.add(new KanjiBasic(94, "犬", "Khuyển (犭)=> con chó",4, ""));
	kanjilist.add(new KanjiBasic(95, "玄", "Huyền => màu đen huyền, huyền bí",5, ""));
	kanjilist.add(new KanjiBasic(96, "玉", "Ngọc => đá quý, ngọc",5, ""));
	kanjilist.add(new KanjiBasic(97, "瓜", "Qua => quả dưa",5, ""));
	kanjilist.add(new KanjiBasic(98, "瓦", "Ngõa => ngói",5, ""));
	kanjilist.add(new KanjiBasic(99, "甘", "Cam => ngọt",5, ""));
	kanjilist.add(new KanjiBasic(100, "生", "Sinh => sinh đẻ, sinh sống",5, ""));
	kanjilist.add(new KanjiBasic(101, "用", "Dụng => dùng",5, ""));
	kanjilist.add(new KanjiBasic(102, "田", "Điền => ruộng",5, ""));
	kanjilist.add(new KanjiBasic(103, "疋", "Thất ( 匹) => đơn vị đo chiều dài, tấm (vải)",5, ""));
	kanjilist.add(new KanjiBasic(104, "疒", "Nạch => bệnh tật",5, ""));
	kanjilist.add(new KanjiBasic(105, "癶", "Bát => gạt ngược lại, trở lại",5, ""));
	kanjilist.add(new KanjiBasic(106, "白", "Bạch => màu trắng",5, ""));
	kanjilist.add(new KanjiBasic(107, "皮", "Bì => da",5, ""));
	kanjilist.add(new KanjiBasic(108, "皿", "Mãnh => bát dĩa",5, ""));
	kanjilist.add(new KanjiBasic(109, "目", "Mục => mắt",5, ""));
	kanjilist.add(new KanjiBasic(110, "矛", "Mâu => cây giáo để đâm",5, ""));
	kanjilist.add(new KanjiBasic(111, "矢", "Thỉ => cây tên, mũi tên",5, ""));
	kanjilist.add(new KanjiBasic(112, "石", "Thạch => đá",5, ""));
	kanjilist.add(new KanjiBasic(113, "示", "Thị; kỳ (礻) => chỉ thị; thần đất",5, ""));
	kanjilist.add(new KanjiBasic(114, "禸", "Nhựu => vết chân, lốt chân",5, ""));
	kanjilist.add(new KanjiBasic(115, "禾", "Hòa => lúa",5, ""));
	kanjilist.add(new KanjiBasic(116, "穴", "Huyệt => hang lỗ",5, ""));
	kanjilist.add(new KanjiBasic(117, "立", "Lập => đứng, thành lập",5, ""));
	kanjilist.add(new KanjiBasic(118, "竹", "Trúc => tre trúc",6, ""));
	kanjilist.add(new KanjiBasic(119, "米", "Mễ  => gạo",6, ""));
	kanjilist.add(new KanjiBasic(120, "糸", "Mịch (糹, 纟) => sợi tơ nhỏ",6, ""));
	kanjilist.add(new KanjiBasic(121, "缶", "Phẫu => đồ sành",6, ""));
	kanjilist.add(new KanjiBasic(122, "网", "Võng (罒, 罓) => cái lưới",6, ""));
	kanjilist.add(new KanjiBasic(123, "羊", "Dương => con dê",6, ""));
	kanjilist.add(new KanjiBasic(124, "羽", "Vũ (羽) => lông vũ",6, ""));
	kanjilist.add(new KanjiBasic(125, "老", "Lão => già",6, ""));
	kanjilist.add(new KanjiBasic(126, "而", "Nhi => mà, và",6, ""));
	kanjilist.add(new KanjiBasic(127, "耒", "Lỗi => cái cày",6, ""));
	kanjilist.add(new KanjiBasic(128, "耳", "Nhĩ => tai (lỗ tai)",6, ""));
	kanjilist.add(new KanjiBasic(129, "聿", "Duật => cây bút",6, ""));
	kanjilist.add(new KanjiBasic(130, "肉", "Nhục => thịt",6, ""));
	kanjilist.add(new KanjiBasic(131, "臣", "Thần => bầy tôi, hạ thần",6, ""));
	kanjilist.add(new KanjiBasic(132, "自", "Tự => tự bản thân, kể từ",6, ""));
	kanjilist.add(new KanjiBasic(133, "至", "Chí => đến",6, ""));
	kanjilist.add(new KanjiBasic(134, "臼", "Cữu => cái cối giã gạo",6, ""));
	kanjilist.add(new KanjiBasic(135, "舌", "Thiệt => cái lưỡi",6, ""));
	kanjilist.add(new KanjiBasic(136, "舛", "Suyễn => sai suyễn, sai lầm",6, ""));
	kanjilist.add(new KanjiBasic(137, "舟", "Chu => cái thuyền",6, ""));
	kanjilist.add(new KanjiBasic(138, "艮", "Cấn => quẻ Cấn (Kinh Dịch); dừng, bền cứng",6, ""));
	kanjilist.add(new KanjiBasic(139, "色", "Sắc => màu, dáng vẻ, nữ sắc",6, ""));
	kanjilist.add(new KanjiBasic(140, "艸", "Thảo (艹) => cỏ",6, ""));
	kanjilist.add(new KanjiBasic(141, "虍", "Hô => vằn vện của con hổ",6, ""));
	kanjilist.add(new KanjiBasic(142, "虫", "Trùng => sâu bọ",6, ""));
	kanjilist.add(new KanjiBasic(143, "血", "Huyết => máu",6, ""));
	kanjilist.add(new KanjiBasic(144, "行", "Hành => đi, thi hành, làm được",6, ""));
	kanjilist.add(new KanjiBasic(145, "衣", "Y (衤) => áo",6, ""));
	kanjilist.add(new KanjiBasic(146, "襾", "Á => che đậy, úp lên",6, ""));
	kanjilist.add(new KanjiBasic(147, "見", "Kiến (见) => trông thấy",7, ""));
	kanjilist.add(new KanjiBasic(148, "角", "Giác => góc, sừng thú",7, ""));
	kanjilist.add(new KanjiBasic(149, "言", "Ngôn => nói",7, ""));
	kanjilist.add(new KanjiBasic(150, "谷", "Cốc => khe nước chảy giữa hai núi, thung lũng",7, ""));
	kanjilist.add(new KanjiBasic(151, "豆", "Đậu => hạt đậu, cây đậu",7, ""));
	kanjilist.add(new KanjiBasic(152, "豕", "Thỉ => con heo, con lợn",7, ""));
	kanjilist.add(new KanjiBasic(153, "豸", "Trãi => loài sâu không chân",7, ""));
	kanjilist.add(new KanjiBasic(154, "貝", "Bối (贝) => vật báu",7, ""));
	kanjilist.add(new KanjiBasic(155, "赤", "Xích => màu đỏ",7, ""));
	kanjilist.add(new KanjiBasic(156, "走", "Tẩu ,(赱) => đi, chạy",7, ""));
	kanjilist.add(new KanjiBasic(157, "足", "Túc => chân, đầy đủ",7, ""));
	kanjilist.add(new KanjiBasic(158, "身", "Thân => thân thể, thân mình",7, ""));
	kanjilist.add(new KanjiBasic(159, "車", "Xa (车) => chiếc xe",7, ""));
	kanjilist.add(new KanjiBasic(160, "辛", "Tân => cay",7, ""));
	kanjilist.add(new KanjiBasic(161, "辰", "Thần => nhật, nguyệt, tinh; thìn (12 chi)",7, ""));
	kanjilist.add(new KanjiBasic(162, "辵", "Sước (辶 ) => chợt bước đi chợt dừng lại",7, ""));
	kanjilist.add(new KanjiBasic(163, "邑", "Ấp (阝) => vùng đất, đất phong cho quan",7, ""));
	kanjilist.add(new KanjiBasic(164, "酉", "Đậu => một trong 12 địa chi",7, ""));
	kanjilist.add(new KanjiBasic(165, "釆", "Biện => phân biệt",7, ""));
	kanjilist.add(new KanjiBasic(166, "里", "Lý => dặm; làng xóm",7, ""));
	kanjilist.add(new KanjiBasic(167, "金", "Kim => kim loại; vàng",8, ""));
	kanjilist.add(new KanjiBasic(168, "長", "Trường (镸 , 长) => dài; lớn (trưởng)",8, ""));
	kanjilist.add(new KanjiBasic(169, "門", "Môn (门) => cửa hai cánh",8, ""));
	kanjilist.add(new KanjiBasic(170, "阜", "Phụ (阝) => đống đất, gò đất",8, ""));
	kanjilist.add(new KanjiBasic(171, "隶", "Đãi => kịp, kịp đến",8, ""));
	kanjilist.add(new KanjiBasic(172, "隹", "Truy, chuy => chim đuôi ngắn",8, ""));
	kanjilist.add(new KanjiBasic(173, "雨", "Vũ => mưa",8, ""));
	kanjilist.add(new KanjiBasic(174, "青", "Thanh (靑) => màu xanh",8, ""));
	kanjilist.add(new KanjiBasic(175, "非", "Phi => không",8, ""));
	kanjilist.add(new KanjiBasic(176, "面", "Diện (靣) => mặt, bề mặt",9, ""));
	kanjilist.add(new KanjiBasic(177, "革", "Cách => da thú; thay đổi, cải cách",9, ""));
	kanjilist.add(new KanjiBasic(178, "韋", "Vi (韦) => da đã thuộc rồi",9, ""));
	kanjilist.add(new KanjiBasic(179, "韭", "Phỉ, cửu => rau phỉ (hẹ)",9, ""));
	kanjilist.add(new KanjiBasic(180, "音", "Âm => âm thanh, tiếng",9, ""));
	kanjilist.add(new KanjiBasic(181, "頁", "Hiệt (页) => đầu; trang giấy",9, ""));
	kanjilist.add(new KanjiBasic(182, "風", "Phong (凬, 风) => gió",9, ""));
	kanjilist.add(new KanjiBasic(183, "飛", "Phi (飞) => bay",9, ""));
	kanjilist.add(new KanjiBasic(184, "食", "Thực (飠, 饣) => ăn",9, ""));
	kanjilist.add(new KanjiBasic(185, "首", "Thủ => đầu",9, ""));
	kanjilist.add(new KanjiBasic(186, "香", "Hương => mùi hương, hương thơm",9, ""));
	kanjilist.add(new KanjiBasic(187, "馬", "Mã (马) => con ngựa",10, ""));
	kanjilist.add(new KanjiBasic(188, "骫", "Cốt => xương",10, ""));
	kanjilist.add(new KanjiBasic(189, "高", "Cao => cao",10, ""));
	kanjilist.add(new KanjiBasic(190, "髟", "Bưu, tiêu => tóc dài; sam => cỏ phủ mái nhà",10, ""));
	kanjilist.add(new KanjiBasic(191, "鬥", "Đấu => chống nhau, chiến đấu",10, ""));
	kanjilist.add(new KanjiBasic(192, "鬯", "Sưởng => rượu nếp; bao đựng cây cung",10, ""));
	kanjilist.add(new KanjiBasic(193, "鬲", "Cách => tên một con sông xưa; => cái đỉnh",10, ""));
	kanjilist.add(new KanjiBasic(194, "鬼", "Quỷ => con quỷ",10, ""));
	kanjilist.add(new KanjiBasic(195, "魚", "Ngư (鱼) => con cá",11, ""));
	kanjilist.add(new KanjiBasic(196, "鳥", "Điểu (鸟) => con chim",11, ""));
	kanjilist.add(new KanjiBasic(197, "鹵", "Lỗ => đất mặn",11, ""));
	kanjilist.add(new KanjiBasic(198, "鹿", "Lộc => con hươu",11, ""));
	kanjilist.add(new KanjiBasic(199, "麥", "Mạch (麦) => lúa mạch",11, ""));
	kanjilist.add(new KanjiBasic(200, "麻", "Ma => cây gai",11, ""));
	kanjilist.add(new KanjiBasic(201, "黃", "Hoàng => màu vàng",12, ""));
	kanjilist.add(new KanjiBasic(202, "黍", "Thử => lúa nếp",12, ""));
	kanjilist.add(new KanjiBasic(203, "黒", "Hắc => màu đen",12, ""));
	kanjilist.add(new KanjiBasic(204, "黹", "Chỉ => may áo, khâu vá",12, ""));
	kanjilist.add(new KanjiBasic(205, "黽", "Mãnh => con ếch; cố gắng (mãnh miễn)",13, ""));
	kanjilist.add(new KanjiBasic(206, "鼎", "Đỉnh => cái đỉnh",13, ""));
	kanjilist.add(new KanjiBasic(207, "鼓", "Cổ => cái trống",13, ""));
	kanjilist.add(new KanjiBasic(208, "鼠", "Thử => con chuột",13, ""));
	kanjilist.add(new KanjiBasic(209, "鼻", "Tỵ => cái mũi",14, ""));
	kanjilist.add(new KanjiBasic(210, "齊", "Tề (斉, 齐 ) => ngang bằng, cùng nhau",14, ""));
	kanjilist.add(new KanjiBasic(211, "齒", "Xỉ (齿, 歯) => răng",15, ""));
	kanjilist.add(new KanjiBasic(212, "龍", "Long (龙 ) => con rồng",16, ""));
	kanjilist.add(new KanjiBasic(213, "龜", "Quy (亀, 龟 ) => con rùa",16, ""));
	kanjilist.add(new KanjiBasic(214, "龠", "Dược => sáo 3 lỗ",17, ""));
	LOG.info("KanjiBasic List was loaded.");
    }

    @Override
    @Transactional
    public List<KanjiBasic> findAll() {
	return kanjilist;
    }

    @Override
    public Page<KanjiBasic> findAll(Pageable pageable) {
	int pageSize = pageable.getPageSize();
	int startPage = pageable.getPageNumber();
	int currentPage = startPage / pageSize;
	List<KanjiBasic> list;

	if (kanjilist.size() < startPage) {
	    list = Collections.emptyList();
	} else {
	    int toEndPage = Math.min(startPage + pageSize, kanjilist.size());
	    list = kanjilist.subList(startPage, toEndPage);
	}

	Page<KanjiBasic> page = new PageImpl<KanjiBasic>(list,PageRequest.of(currentPage, pageSize),kanjilist.size());
	return page;
    }

}
