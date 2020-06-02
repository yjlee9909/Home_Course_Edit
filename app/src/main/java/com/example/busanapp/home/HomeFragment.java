package com.example.busanapp.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busanapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private ImageAdapter adapter = new ImageAdapter();
    private RecyclerView recyclerView;
    //추가
    List<Course> first_Course;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        /*LinearLayoutManager horizonalLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);

        recyclerView.setLayoutManager(horizonalLayoutManager);
        recyclerView.setAdapter(adapter);

        adapter.setItems(new ImageData().getItems());*/


        //course

        first_Course = new ArrayList<>();

        first_Course.add(new Course("1박 2일에 완성하는 부산 해안선 완전 정복!", "1박 2일 여행\n",
                "★추천코스★",

                "\n" +
                        "1일차 : 영도대교 - 흰여울문화마을 / 절영해안산책로 - 태종대 - 국제시장/깡통시장 - 용두산공원\n\n" +
                        "2일차 : 해운대해수욕장 - 아쿠아리움 - 동백해안산책로(누리마루APEC하우스) - 오륙도스카이워크 - 이기대해안산책로 - 광안대교\n",

                "영도대교에서 여정을 시작한다.\n" +
                        "영도로 향하는 관문인 영도대교는 1950년대 한국전쟁으로 인해 생이별한 가족들이 훗날 만남을 기약하던 유명한 다리였다.\n" +
                        "한국 최초의 도개교로 매일 오후 2시 도개행사가 열린다.\n ",

                "흰여울문화마을과 마을 아래 절영해안산책로에서는 영화촬영 장소 찾기, 아기자기한 카페 구경하기, 바다 전망 인생샷 찍기 등으로 매번 분주하다.\n ",

                "영도에 왔다면 뛰어난 해안절경을 자랑하는 태종대도 놓쳐서는 안 된다. " +
                        "맑은 날 전망대에 오르면 대마도까지 조망할 수 있고 다누비열차를 이용해 태종대 전체를 편하게 둘러볼 수 있다.\n",

                "국제시장은 영화로 만들어질 만큼 전쟁의 슬픈 역사가 남아 있는 곳이다. 다양한 구제 물품과 수입품을 저렴한 가격에 구매할 수 있다.\n "+
                        "시간 가는 줄 모르고 시장 구경을 하다 허기가 지면 인근 깡통시장으로 걸음을 옮겨보자. 맛도 가격도 착한 주전부리의 진수가 기다리고 있다.\n",

                "국제시장에서 도보로 10분 거리에 용두산 공원이 자리해 있다. 부산 랜드마크인 부산타워 전망대는 일몰시간이면 최고의 전망을 자랑한다.\n " +
                        "땅거미가 지기 시작하면 노을에 붉게 빛나는 부산항, 영도, 남포동, 국제시장 등이 파노라마처럼 한눈에 들어온다.\n " +
                        "해가 진 후, 환상적 야경을 눈에 담으며 첫째 날을 마무리한다.\n\n",

                "해운대에서 시작하는 여행 2일차.\n " +
                        "우리나라 대표 관광지이자 많은 인파가 찾는 곳인 만큼 주변에는 숙박 시설과 오락 시설들이 잘 조성돼 있다. \n",

                "부산 대표 실내관광명소인 부산아쿠아리움에서는 살아 있는 다양한 해양생물들을 직접 눈으로 볼 수 있으며, 시간대별로 다양한 수중 공연이 펼쳐진다.\n ",

                "숲과 바다가 어우러진 명품 해안산책로 동백섬이다.\n\n " +
                        //내용전환
                        "해운대 해변 끝자락에서 시작해 누리마루APEC하우스를 거쳐 더베이101으로 이어지는 코스로 이동하거나 또는 그 반대 방향으로 코스를 잡아도 좋다.\n " +
                        "하얀 등대가 반기는 전망대에서 시원한 부산 앞바다와 웅장한 광안대교를 한눈에 조망할 수 있다.\n\n",R.drawable.busan_1n2d,R.drawable.busan_1n2d_first,R.drawable.busan_1n2d_second,R.drawable.busan_1n2d_third,R.drawable.busan_1n2d_fourth,
                R.drawable.busan_1n2d_fifth,R.drawable.busan_1n2d_sixth,R.drawable.busan_1n2d_seventh,R.drawable.busan_1n2d_eighth,R.drawable.busan_1n2d_ninth)); //오류
        first_Course.add(new Course("2박 3일에 완성하는 부산 완전정복","2박 3일",
                "추천코스\n" + "\n" +
                        "1일차 : 범어사 - 동래읍성 - 복천박물관/복천동고분군 - 죽성성당 - 해동용궁사 - 송정해수욕장/죽도공원\n" +
                        "2일차 : 해운대해수욕장/동백섬 - 오륙도 - 태종대 - 영도대교 - 용두산공원\n" +
                        "3일차 : 감천문화마을 - 송도해수욕장/케이블카 - 다대포 해수욕장 - 장림포구 - 을숙도 - 가덕도\n" +
                        "\n" + "\n" +
                        "1일차 추천코스\n" + "범어사 → 동래읍성 → 복천박물관/복천동고분군 → 죽성성당 → 해동용궁사 → 송정해수욕장/죽도공원\n" +
                        "\n",
                "황금빛 물고기가 내려와 노닐었다는 천년고찰 범어사는 차분하고 아늑한 산사의 분위기를 물씬 풍긴다. 사찰 자체가 문화재인 범어사에서 문화재급의 아름다운 자연도 함께 즐겨보자.\n",

                "조선시대 동래부를 지켜주던 동래읍성, 그 성벽을 따라 걸으며 임진왜란 최대 격전지였던 곳의 흔적을 새긴다. 성벽 아래 복천동고분군에서는 가야 왕국의 무덤이 발견되었고 출토된 유물을 복천박물관에서 전시하고 있다." +
                        "죽성마을 갯바위 끝에 한 폭의 그림처럼 걸려있는 죽성성당. 푸른 하늘, 에메랄드빛 바다와 어우러진 예쁜 성당 앞에는 너도나도 사진 찍기 바쁜 사람들로 종일 북적인다.\n",

                "뒤로는 소나무가 우거진 바위산이 사찰을 감싸고, 앞으로는 푸른 망망대해가 펼쳐져 있는 해동용궁사에서 새로운 추억을 만들어보자.\n",

                "서핑을 배우는 교육생들의 활기로 가득한 송정해수욕장의 끝자락, 죽도공원에서는 햇빛에 반짝이는 송정 바다 위, 밀려오는 파도를 즐기는 서퍼들의 소리가 어울린 천혜의 휴식처를 만날 수 있다.\n" + "\n\n\n\n" +
                        "2일차 추천코스\n" + "해운대해수욕장/동백섬 → 오륙도 → 태종대 → 영도대교 → 용두산공원\n" +
                        "\n",

                "해운대 해수욕장의 드넓은 백사장을 따라 걷다가 동백섬을 만나면 해안산책로를 유유자적 한 바퀴 돌아보자. 병풍처럼 펼쳐진 해운대의 마천루와 광안대교의 전망을 동시에 조망할 수 있다.\n",


                "오륙도는 시원하게 트인 바다가 일상의 근심을 날려주고 기암괴석에 부딪히는 하얀 포말이 삶의 위로가 되는 곳이다." +
                        "멋진 바다풍경하면 태종대를 빼놓을 수가 없다. 깎아지는 벼랑과 부딪치는 하얀 파도, 끝없이 푸른 바다와 함께 녹음으로 가득한 태종대 공원을 넉넉하게 돌아보자.\n" +
                        "영도와 남포동을 이어주는 주황색 영도대교를 넘어 도심 한가운데 봉긋 솟아있는 용두산 공원에 오른다. 부산타워 전망대에서는 부산의 동서남북을 모두 조망할 수 있다.\n\n\n" +
                        "3일차 추천코스\n" + "감천문화마을 → 송도해수욕장/케이블카 → 다대포해수욕장 → 장림포구 → 을숙도 → 가덕도\n\n",


                "한국의 마추픽추 감천문화마을로 향한다. 부산의 피란역사를 고스란히 담고 있는 이곳은 곳곳에 설치된 예술작품과 벽화가 형형색색의 지붕과 어우러져 낙후되었던 감천을 감성골목으로 만들었다." +
                        "우리나라 1호 해수욕장인 송도해수욕장이 해상케이블카와 스카이워크로 옛 명성을 되찾았다. 깨끗한 백사장과 해안산책로, 해송 우거진 숲길산책로까지 모두 갖춘 송도해수욕장은 방문리스트 1호!\n",


                "드넓은 자연 그 자체의 바다, 다대포해수욕장은 수평선보다는 지평선이 보이는 느낌이다. 오직 바다와 나지막한 산이 시야를 가득 채우는 이곳은 황홀한 낙조를 선사하는 곳으로 유명하다.\n",


                "‘부네치아’라는 애칭을 얻은 장림포구는 형형색색의 창고건물이 긴 포구를 따라 마주보고 있는 모습이 이국적인 정취를 자아낸다.\n" +
                        "가을이 짙어갈수록 흰 꽃을 피우는 억새군락 사이로 날아오르는 철새들을 관찰할 수 있는 을숙도는 미술관과 문화회관도 위치해 자연과 문화를 동시에 즐길 수 있는 아름다운 섬이다.\n" +
                        "부산과 거제도를 잇는 거가대교의 개통으로 유명해진 가덕도는 천혜의 자연환경이 그대로 보존된 섬이다. 그 풍경 속에 가려져 미처 몰랐던 가덕도의 슬픈 역사도 마주할 수 있다.\n\n",
                R.drawable.two_three_first,R.drawable.two_three_first_dtwo,R.drawable.two_three_first_dthree,R.drawable.two_three_first_dfour,R.drawable.two_three_first_dfive,
                R.drawable.two_three_first_dsix,R.drawable.two_three_first_dseven,R.drawable.two_three_first_deight,R.drawable.two_three_first_dnine,R.drawable.two_three_first_dten));

        first_Course.add(new Course("부산 낭만카페 35선 1편", "카페 투어",
                " 로맨틱한 도시 부산이 알려주는 낭만 가득한 카페 35선." +
                        " 본격적으로 카페투어에 나서보고자 하는 카페러버에게 필수 정보 되겠다." +
                        " 지역별로 묶은 부산 낭만카페35선 제 1탄을 시작한다.\n",

                "# 중구지역\n\n" +
                        "레귤러하우스\n\n" +
                        " 남포동 국제시장 내부에 위치한 ‘레귤러하우스’는 재즈 음악과 빈티지가 잘 어우러진 카페이다." +
                        " 고풍스러우면서도 고급진 소품들과 빈티지한 인테리어가 특징인 이곳은 커피뿐만 아니라 차와 디저트의 종류가 다양해 골라 먹는 재미가 있는 곳이다.\n",

                "노티스1950\n\n" +
                        " 중앙동에 위치한 노티스1950은 1950년대 쌀 창고로 이용되었던 건물을 리모델링하여 복합문화공간으로 재탄생시켰다." +
                        " 창가에 앉아 부산항의 전망을 즐길 수 있는 것이 특징인 이곳은 드라마 ‘쌈, 마이웨이’를 비롯해 영화, 드라마, 광고 촬영지로도 유명하다.\n",

                "바우노바 백산점\n\n" +
                        " 남포동과 중앙동 사이쯤 위치하고 있는 ‘바우노바 백산점’은 일본식 목조건물을 개조한 조용하고 안락한 카페이다. 이곳에선 커피를 테이크아웃 할 수 없다." +
                        " 핸드드립 커피를 고집하는 만큼이나 천천히, 그리고 충분히 커피 맛을 음미할 수 있는 진정한 공간이 되기를 바라는 주인장의 마음일 것이다.\n",

                "\n# 서구지역\n\n" +
                        "TCC\n\n" +
                        " 암남동 ‘TCC’ 카페는 송도해수욕장을 한 눈에 담을 수 있는 곳에 자리하고 있다." +
                        " 가장 인기 있는 장소는 탁 트인 송도 앞 바다를 볼 수 있는 루프탑이다." +
                        " 통유리로 만들어진 창은 바다 전망을 즐길 수 있고, 화사한 실내에 분위기를 더한다." +
                        " 주변에는 송도해상케이블카와 시티투어버스 정류소가 있다.\n",

                "빈스톡\n\n" +
                        " 송도에는 부산 3대 커피장인이 운영하는 카페로 유명한 빈스톡이 있다." +
                        " 원두의 풍부한 향을 느끼고 싶다면 다크 로스트로 유명한 커피장인이 빚어내는 핸드드립 커피를 맛 볼 수 있는 빈스톡을 추천 한다.\n",

                "\n# 동구지역\n\n" +
                        "카페 초량1941\n\n" +
                        " 초량동 산복도로에 위치하고 있는 ‘초량1941’은 1941년 지어진 일본식 가옥을 개조해 만든 카페이다. 다양한 종류의 우유카페로 유명한 이곳은 숲의 신선한 공기를 마시며 자연을 느낄 수 있다." +
                        " 우유뿐만 아니라 다양한 굿즈도 판매한다.\n",

                "문화공감 수정\n\n" +
                        " 도시철도 부산진역 근처에 위지하고 있는 ‘문화공감수정’은 일본식 전통가옥의 느낌을 그대로 살려 카페로 운영되고 있다." +
                        " 입구를 지나 가옥을 보고 있으면 마치 일본의 어느 집에 들어온 듯한 착각을 불러일으킨다." +
                        " 일본식 가옥이지만 한국 전통차를 맛볼 수 있다." +
                        " 아이유의 ‘밤 편지’ 뮤직비디오 촬영지로도 유명하다.\n",

                "\n# 남구지역\n\n" +
                        "딜라잇식스\n\n" +
                        " 대연동에 위치한 ‘딜라잇식스’는 도심형 카페이다." +
                        " 각 공간마다 테마가 있어 찾는 사람들에게 다양한 볼거리를 제공한다." +
                        " 본관과 별관으로 구분되어 있고 공간이 넓어, 원하는 공간에서 커피를 즐길 수 있다." +
                        " 주변을 둘러보면 사진을 찍을 수 있는 포토존도 쉽게 찾아볼 수 있다.\n",

                "카페 이정원\n\n" +
                        " 경성대 대학가에 위치한 ‘카페 이정원’은 카페 이름처럼 식물을 활용한 정원 인테리어가 독창적이다." +
                        " 정원이 한눈에 들어오는 통 창 가득 햇살이 쏟아지는 이곳은 다양한 커피를 비롯해 10여 가지 종류의 베이커리 메뉴로도 유명하다.\n",

                R.drawable.cafe1_1, R.drawable.cafe1_2, R.drawable.cafe1_3, R.drawable.cafe1_4, R.drawable.cafe1_5,
                R.drawable.cafe1_6, R.drawable.cafe1_7, R.drawable.cafe1_8, R.drawable.cafe1_9, R.drawable.cafe1_10));
        first_Course.add(new Course("부산 낭만카페 35선 2편", "카페 투어",
                " 로맨틱한 도시 부산이 알려주는 낭만 가득한 카페 35선." +
                        " 본격적으로 카페투어에 나서보고자 하는 카페러버에게 필수 정보 되겠다." +
                        " 지역별로 묶은 부산 낭만카페35선 제 2탄!\n",

                "# 영도구지역\n\n" +
                        "카린 영도플레이스\n\n" +
                        " 선글라스 브랜드로 유명한 ‘카린’은 청학동에 카페 ‘카린 영도플레이스’를 운영하고 있다." +
                        " 넓은 주차장과 루프탑이 있어 탁 트인 시원한 영도 바다 전망을 즐길 수 있다." +
                        " 북유럽 스타일의 인테리어로 쾌적하고 깔끔한 분위기를 느낄 수 있으며, 카린 선글라스 쇼룸이 있어 다양한 선글라스를 직접 써볼 수도 있다.\n",

                "신기산업\n\n" +
                        " 사무용품 제조회사인 신기산업은 회사의 사옥을 카페로 운영하고 있다." +
                        " 바다뷰 카페투어의 성지가 이곳에서부터 시작되었다고 할 수 있다." +
                        " 내부는 화이트와 그레이톤으로 꾸며져 있어 차분한 분위기를 느낄 수 있다." +
                        " 부산항대교와 영도 일대를 바라볼 수 있으며, 밤에는 멋진 야경도 즐길 수 있다.\n",

                "젬스톤\n\n" +
                        " 수영장 안에서 커피를 마신다면 어떤 기분일까." +
                        " 카페 젬스톤은 수영장이었던 건물의 인테리어를 그대로 살려 카페로 탈바꿈시켰다." +
                        " 카페 곳곳이 다양한 테마로 꾸며져 있어 사진을 찍거나 구경하는 재미가 쏠쏠하다." +
                        " 어떤 카페에서도 느낄 수 없는 독특한 분위기를 즐길 수 있는 곳이다.\n",

                "\n# 부산진구지역\n\n" +
                        "빈티지38\n\n" +
                        " 아늑한 공간에서 여유로운 시간을 보내고 싶다면 전포카페거리에 위치한 카페 ‘빈티지38’을 추천한다." +
                        " 빈티지한 느낌을 물씬 풍기는 외관과는 달리 내부는 현대적인 감각으로 꾸며져 있다." +
                        " 직접 로스팅한 커피와 베테랑 파티쉐의 베이커리를 24시간 맛볼 수 있는 곳.\n",

                "비포선셋\n\n" +
                        " 유럽풍의 인테리어와 이국적인 분위기를 원한다면 ‘비포선셋’은 어떨까." +
                        " 다양한 식물을 활용한 인테리어는 싱그럽고 편안한 분위기를 만들어 준다." +
                        " 이곳은 국내 여행자들뿐만 아니라 SNS를 통해서 입소문을 타고 온 일본·중국·대만 등의 외국인들이 자주 방문하는 곳이다.\n",

                "오월생\n\n" +
                        " 사장님이 직접 만든 수제 디저트로 유명한 카페 ‘오월생’은 화이트로 꾸며진 인테리어가 특징인 곳이다." +
                        " 화사하고 밝은 분위기와 주인장의 감성 있는 인테리어 소품들이 조화를 이뤄 많은 사람들이 사진을 찍기 위해 찾아오는 카페이기도 하다.\n",

                "유월커피\n\n" +
                        " 6월과 your을 모두 담고 있는 카페 ‘유월커피’는 전포 카페거리 터줏대감이다." +
                        " 작고 오래된 외관의 건물이지만 안으로 들어가면 아늑하고 포근한 분위기를 느낄 수 있다." +
                        " 맛있는 커피와 함께 특유의 차분한 분위기를 즐기기에 안성맞춤.\n",

                "\n# 해운대지역\n\n" +
                        "엣지993\n\n" +
                        " 해운대해수욕장 근처에 위치한 ‘엣지993’은 바다 전망이 좋기로 유명하다." +
                        " 1, 5, 6층이 카페로 운영되고 모든 테이블이 바다를 향하고 있다." +
                        " 6층 루프탑에서 바다를 바라보면 해운대 백사장과 좌우로 펼쳐지는 광안대교, 마린시티, 동백섬 등 부산의 랜드마크를 한눈에 볼 수 있다.\n",

                "포트1902\n\n" +
                        " 송정해수욕장과 멀지 않은 곳에 위치하고 있는 ‘포트1902’은 커피뿐만 아니라 전시, 공연, 파티 등 다양한 목적의 공간으로 운영되는 곳이다." +
                        " 국내 최초로 풀장을 보유한 카페로도 알려져 있고, 층별로 색다른 인테리어를 선보인다.\n",

                R.drawable.cafe2_1, R.drawable.cafe2_2, R.drawable.cafe2_3, R.drawable.cafe2_4, R.drawable.cafe2_5,
                R.drawable.cafe2_6, R.drawable.cafe2_7, R.drawable.cafe2_8, R.drawable.cafe2_9, R.drawable.cafe2_10));
        first_Course.add(new Course("부산 낭만카페 35선 3편", "카페 투어",
                " 로맨틱한 도시 부산이 알려주는 낭만 가득한 카페 35선." +
                        " 본격적으로 카페투어에 나서보고자 하는 카페러버에게 필수 정보 되겠다." +
                        " 지역별로 묶은 부산 낭만카페35선 제 3탄!\n" +
                        " 저녁이 되면 거대한 마천루 아래 알록달록 불을 밝히는 해운대 포장마차는 그 분위기마저 낭만적이다.\n",

                "# 동래구지역\n\n" +
                        "아트케이갤러리 카페\n\n" +
                        " 아름다운 정원과 멋지게 어우러진 외관이 눈길을 사로잡는 아트케이갤러리." +
                        " 아트홀, 정원카페, 갤러리카페로 이루어져 있다." +
                        " 구 수가화랑을 복합문화공간으로 재탄생 시킨 이곳에서는 다양한 문화 행사가 열리며, 카페 곳곳에서 다양한 예술작품을 감상 할 수 있다.\n",

                "그린내\n\n" +
                        " 동래 복천동 고분으로 가는 한적한 길에 위치한 ‘그린내’는 직접 만든 커피와 빵으로 유명한 곳이다." +
                        " 로스팅을 배울 수 있는 교육 프로그램을 진행하고 있으며, 탁 트인 고분일대의 전망을 볼 수 있는 공간과 천장 위로 하늘을 볼 수 있는 다락방이 있다.\n",

                "어반플로우\n\n" +
                        " 벚꽃 명소로 알려진 온천천 카페거리에 위치한 ‘어반플로우’는 모던 화이트톤으로 꾸며져 트렌디한 분위기를 느낄 수 있다." +
                        " 밝은 인테리어 덕에 카페 안에서도 멋진 사진들을 담을 수 있는 곳이다." +
                        " 전문 바리스타가 운영하고 있으며 수플레 팬케이크가 맛있기로 유명하다.\n",

                "\n# 북구지역\n\n" +
                        "루왁\n\n" +
                        " 도심 속에서 이색적인 분위기를 찾고 싶다면 카페 ‘루왁’을 추천한다." +
                        " 금곡동 부산인도네시아센터 1층에 자리하고 있는 이곳은 인도네시아 전통 기념품들과 특산품 코너도 따로 마련되어 있다." +
                        " 한국 속 작은 인도네시아를 느끼며 커피 한 잔의 여유를 즐기고 싶은 이들에게 알맞은 장소.\n",

                "\n# 사상구지역\n\n" +
                        "Vsant\n\n" +
                        " 낙동강 강변대로의 전망을 즐길 수 있는 ‘Vsant.’" +
                        " 해질 무렵 방문한다면 운치 있는 노을을 마주하며 커피를 즐길 수 있는 곳이다." +
                        " 중후하면서도 럭셔리한 내부 인테리어는 커피의 진한 맛을 더해준다." +
                        " 3층 루프탑에 오르면 곳곳에 선셋 포인트와 포토존이 준비되어 있다.\n",

                "\n# 기장군지역\n\n" +
                        "웨이브온\n\n" +
                        " 기장바다를 바라보는 오션뷰가 유명한 카페 ‘웨이브온’은 한국건축문화대상에 입상 할 만큼 건물의 외관이 인상적이다." +
                        " 루프 탑, 통유리 등 카페 내부에서도 오션뷰를 즐길 수 있도록 꾸며졌다." +
                        " 특히, 루프탑에서 즐기는 바다 풍경이 그림처럼 아름다운 곳이다.\n",

                "아데초이\n\n" +
                        " 깔끔한 화이트풍의 외관과는 달리, 앤티크 한 내부 소품과 원색의 대비가 이국적인 카페 아데초이." +
                        " 원목으로 만든 테이블과 늘어진 샹들리에가 묘한 조화를 이루는 곳이다." +
                        " 티타임 후 한적한 해안마을을 산책할 수 있는 멋진 곳에 위치한다.\n",

                "헤이든\n\n" +
                        " 작은 공원과 함께 자리하고 있는 바다 앞 카페 ‘헤이든’은 가벼운 산책을 즐기며 들르기 좋은 곳이다." +
                        " 카페 안에 위치한 테이블 뿐 아니라 외부에도 커피를 마시며 경치를 구경 할 수 있도록 다양한 위치에 테이블을 마련해 두었다." +
                        " 덕분에 기장 앞바다가 한눈에 들어오는 풍경을 즐길 수 있다.\n",

                "비치다카페\n\n" +
                        " 주택을 리모델링한 ‘비치다카페’는 3개의 건물 동과 아이들도 뛰어 놀 수 있을 만큼 넓은 정원이 특징이다." +
                        " 각 동마다 루프탑이 있어 시원한 바다 바람과 함께 푸른 하늘을 감상할 수 있다." +
                        " 가장 높은 루프탑에선 기장 바다풍경과 더불어 빨강, 하양 방파제를 눈에 담을 수 있다.\n",

                R.drawable.cafe3_1, R.drawable.cafe3_2, R.drawable.cafe3_3, R.drawable.cafe3_4, R.drawable.cafe3_5,
                R.drawable.cafe3_6, R.drawable.cafe3_7, R.drawable.cafe3_8, R.drawable.cafe3_9, R.drawable.cafe3_10));
//        first_Course.add(new Course("부산 핫스팟 여행 코스", "여행코스", "사진 출처 구글", R.drawable.sixth));

        RecyclerView myrv = view.findViewById(R.id.recyclerView);

        RecyclerView.Adapter myAdapter = new RecyclerViewAdapter(getActivity(), first_Course);

        //myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 가로 레이아웃
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);

        // 레이아웃 매니저 연결
        myrv.setLayoutManager(horizontalLayoutManager);

        myrv.setAdapter(myAdapter);

        return view;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

}

