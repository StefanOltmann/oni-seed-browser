package service

val testPaths = """
    Sandstone:203.0,95.0 216.2,115.7 215.8,127.4 207.8,140.7 187.6,151.1 172.7,147.1 160.3,133.4 158.4,110.4 161.3,103.2 186.5,91.4;187.6,151.1 189.8,158.2 180.5,174.0 167.7,174.3 161.6,168.0 172.7,147.1;216.9,154.2 212.8,162.6 189.8,158.2 187.6,151.1 207.8,140.7;182.0,78.1 186.5,91.4 161.3,103.2 158.0,95.3 172.6,75.7;233.4,140.5 232.6,148.6 216.9,154.2 207.8,140.7 215.8,127.4;226.9,91.6 229.0,105.2 216.2,115.7 203.0,95.0 207.0,90.6;160.3,133.4 144.2,135.9 138.5,120.0 158.4,110.4;201.5,67.0 207.0,90.6 203.0,95.0 186.5,91.4 182.0,78.1 198.2,66.2
    ToxicJungle:212.8,162.6 217.5,178.3 196.1,194.2 180.5,174.0 189.8,158.2;161.6,168.0 167.7,174.3 159.8,203.4 150.3,206.1 142.7,203.4 135.0,179.3 147.6,166.6;257.4,84.2 261.6,103.1 252.4,114.6 229.0,105.2 226.9,91.6 235.3,81.0;216.3,33.9 218.7,58.2 201.5,67.0 198.2,66.2 187.8,45.4 197.0,32.3 210.2,29.8;230.8,63.4 235.3,81.0 226.9,91.6 207.0,90.6 201.5,67.0 218.7,58.2;298.5,137.0 295.4,155.3 278.7,162.3 266.8,153.2 266.8,134.6 286.7,126.0;111.9,123.4 111.0,144.3 85.6,148.3 77.2,123.9 90.5,111.7;321.8,186.6 320.0,209.8 309.4,216.5 290.9,207.8 290.8,189.7 313.2,178.9;113.1,87.2 90.1,99.4 78.9,89.6 83.8,65.5 107.8,63.4;161.0,31.5 169.5,46.1 162.5,59.5 140.8,61.5 136.6,57.6 138.0,32.5 143.6,28.0;110.7,178.1 109.7,205.9 94.9,212.4 86.0,208.3 79.5,187.2 88.8,175.9;88.8,175.9 79.5,187.2 58.7,185.2 51.1,173.0 59.5,156.9 81.3,155.0;197.0,32.3 187.8,45.4 169.5,46.1 161.0,31.5 178.0,9.6;172.6,75.7 158.0,95.3 138.8,85.5 140.8,61.5 162.5,59.5;245.2,31.6 249.0,49.9 230.8,63.4 218.7,58.2 216.3,33.9 240.5,28.3;82.5,31.6 76.3,57.9 57.9,59.8 44.3,38.1 56.4,26.6;304.5,17.0 281.6,31.1 270.6,21.4 270.0,0.0 304.6,0.0;326.8,56.5 317.7,80.2 293.4,76.3 295.1,51.8 316.1,45.4;317.7,80.2 322.8,88.3 315.9,106.5 288.4,107.0 288.2,106.8 290.6,78.4 293.4,76.3
    BoggyMarsh:196.1,194.2 195.1,201.9 173.1,209.5 159.8,203.4 167.7,174.3 180.5,174.0;245.5,162.0 243.7,175.1 228.7,183.4 217.5,178.3 212.8,162.6 216.9,154.2 232.6,148.6;172.7,147.1 161.6,168.0 147.6,166.6 137.8,146.3 144.2,135.9 160.3,133.4;158.0,95.3 161.3,103.2 158.4,110.4 138.5,120.0 126.3,114.1 124.6,93.1 138.8,85.5;252.4,114.6 253.7,124.8 233.4,140.5 215.8,127.4 216.2,115.7 229.0,105.2;278.7,162.3 277.5,179.9 260.7,187.9 243.7,175.1 245.5,162.0 266.8,153.2;260.7,187.9 258.2,206.8 251.3,211.1 231.0,206.1 228.7,183.4 243.7,175.1;140.8,61.5 138.8,85.5 124.6,93.1 113.1,87.2 107.8,63.4 109.7,60.8 136.6,57.6;198.2,66.2 182.0,78.1 172.6,75.7 162.5,59.5 169.5,46.1 187.8,45.4;147.6,166.6 135.0,179.3 113.2,176.3 114.8,148.0 137.8,146.3;138.5,120.0 144.2,135.9 137.8,146.3 114.8,148.0 111.0,144.3 111.9,123.4 126.3,114.1;83.8,65.5 78.9,89.6 61.4,92.3 49.1,74.3 57.9,59.8 76.3,57.9;210.2,29.8 197.0,32.3 178.0,9.6 178.1,0.0 213.2,0.0;290.6,78.4 288.2,106.8 261.6,103.1 257.4,84.2 265.9,74.1;79.5,187.2 86.0,208.3 63.0,220.7 48.1,207.2 58.7,185.2
    FrozenWastes:135.0,179.3 142.7,203.4 123.6,212.4 109.7,205.9 110.7,178.1 113.2,176.3;228.7,183.4 231.0,206.1 223.3,212.3 200.6,208.4 195.1,201.9 196.1,194.2 217.5,178.3;138.0,32.5 136.6,57.6 109.7,60.8 104.6,34.6 113.1,27.3;266.8,134.6 266.8,153.2 245.5,162.0 232.6,148.6 233.4,140.5 253.7,124.8;124.6,93.1 126.3,114.1 111.9,123.4 90.5,111.7 90.1,99.4 113.1,87.2;77.2,123.9 85.6,148.3 81.3,155.0 59.5,156.9 48.9,139.3 61.8,121.6;261.9,56.3 265.9,74.1 257.4,84.2 235.3,81.0 230.8,63.4 249.0,49.9;295.1,51.8 293.4,76.3 290.6,78.4 265.9,74.1 261.9,56.3 282.4,41.8;178.0,9.6 161.0,31.5 143.6,28.0 142.2,0.0 178.1,0.0;270.6,21.4 245.2,31.6 240.5,28.3 237.7,0.0 270.0,0.0;83.3,31.1 82.5,31.6 56.4,26.6 52.1,0.0 86.3,0.0;240.5,28.3 216.3,33.9 210.2,29.8 213.2,0.0 237.7,0.0
    Ocean:312.7,169.3 313.2,178.9 290.8,189.7 277.5,179.9 278.7,162.3 295.4,155.3;290.8,189.7 290.9,207.8 279.0,215.5 258.2,206.8 260.7,187.9 277.5,179.9;114.8,148.0 113.2,176.3 110.7,178.1 88.8,175.9 81.3,155.0 85.6,148.3 111.0,144.3;113.1,27.3 104.6,34.6 83.3,31.1 86.3,0.0 111.4,0.0;104.6,34.6 109.7,60.8 107.8,63.4 83.8,65.5 76.3,57.9 82.5,31.6 83.3,31.1;281.6,31.1 282.4,41.8 261.9,56.3 249.0,49.9 245.2,31.6 270.6,21.4;143.6,28.0 138.0,32.5 113.1,27.3 111.4,0.0 142.2,0.0;288.2,106.8 288.4,107.0 286.7,126.0 266.8,134.6 253.7,124.8 252.4,114.6 261.6,103.1;318.4,30.0 316.1,45.4 295.1,51.8 282.4,41.8 281.6,31.1 304.5,17.0
    OilField:90.1,99.4 90.5,111.7 77.2,123.9 61.8,121.6 54.0,106.9 61.4,92.3 78.9,89.6;61.8,121.6 48.9,139.3 33.6,138.7 24.7,121.9 32.9,107.0 54.0,106.9;48.9,139.3 59.5,156.9 51.1,173.0 32.8,173.0 23.6,152.5 33.6,138.7;44.3,38.1 57.9,59.8 49.1,74.3 33.2,75.5 22.6,60.5 34.5,37.8;58.7,185.2 48.1,207.2 34.0,209.2 24.6,183.5 32.8,173.0 51.1,173.0;61.4,92.3 54.0,106.9 32.9,107.0 24.4,91.5 33.2,75.5 49.1,74.3;56.4,26.6 44.3,38.1 34.5,37.8 27.1,30.2 31.4,0.0 52.1,0.0
    MagmaCore:33.6,138.7 23.6,152.5 0.0,152.2 0.0,122.0 24.7,121.9;32.9,107.0 24.7,121.9 0.0,122.0 0.0,91.6 24.4,91.5;23.6,152.5 32.8,173.0 24.6,183.5 0.0,184.0 0.0,152.2;34.0,209.2 31.3,212.4 0.0,213.9 0.0,184.0 24.6,183.5;22.6,60.5 33.2,75.5 24.4,91.5 0.0,91.6 0.0,60.1;27.1,30.2 0.0,30.4 0.0,0.0 31.4,0.0;34.5,37.8 22.6,60.5 0.0,60.1 0.0,30.4 27.1,30.2
""".trimIndent()

/**
 * Belongs to V-VOLCA-C-478948923-0-0-OL VanillaVolcanic
 */
val testSvg = """
    <?xml version="1.0" encoding="UTF-8" standalone="no"?>
    <!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
    <svg width="100%" height="100%" viewBox="0 0 480 760" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xml:space="preserve" xmlns:serif="http://www.serif.com/" style="fill-rule:evenodd;clip-rule:evenodd;">
        <g>
            <path d="M311.4,297.2L327.2,272.4L326.4,243.2L305.8,217.2L267.2,214.6L243.8,230.8L234,259.6L254,298.6L266.2,304.6L311.4,297.2Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M53.4,709L25.6,687.8L0,689.2L0,760L48,760L53.4,709Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M25.6,687.8L50.6,648.4L36.8,624.6L0,622.8L0,689.2L25.6,687.8Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M61.4,589L22,549.4L0,549L0,622.8L36.8,624.6L61.4,589Z" style="fill:rgb(63,28,5);fill-rule:nonzero;stroke:rgb(63,28,5);stroke-width:1px;"/>
            <path d="M63.4,510L40.8,479.8L0,479.2L0,549L22,549.4L63.4,510Z" style="fill:rgb(157,201,214);fill-rule:nonzero;stroke:rgb(157,201,214);stroke-width:1px;"/>
            <path d="M61.2,440.8L40.4,415.2L0,415.4L0,479.2L40.8,479.8L61.2,440.8Z" style="fill:rgb(211,152,152);fill-rule:nonzero;stroke:rgb(211,152,152);stroke-width:1px;"/>
            <path d="M40.4,415.2L60,374.6L45.6,352.2L0,351.2L0,415.4L40.4,415.2Z" style="fill:rgb(157,201,214);fill-rule:nonzero;stroke:rgb(157,201,214);stroke-width:1px;"/>
            <path d="M62,317.4L43.6,291.8L0,291.6L0,351.2L45.6,352.2L62,317.4Z" style="fill:rgb(203,149,163);fill-rule:nonzero;stroke:rgb(203,149,163);stroke-width:1px;"/>
            <path d="M62.4,252L50.2,232.4L0,232.4L0,291.6L43.6,291.8L62.4,252Z" style="fill:rgb(162,205,164);fill-rule:nonzero;stroke:rgb(162,205,164);stroke-width:1px;"/>
            <path d="M62.2,199.4L40.2,173.4L0,173.4L0,232.4L50.2,232.4L62.2,199.4Z" style="fill:rgb(157,201,214);fill-rule:nonzero;stroke:rgb(157,201,214);stroke-width:1px;"/>
            <path d="M40.2,173.4L65,123.4L50.8,111.4L0,113L0,173.4L40.2,173.4Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M50.8,111.4L53.2,53.6L0,47.2L0,113L50.8,111.4Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M63.8,45.6L64,0L0,0L0,47.2L53.2,53.6L63.8,45.6Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M87.8,695.8L85.6,656.8L50.6,648.4L25.6,687.8L53.4,709L87.8,695.8Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M103.2,644.2L105,611L78.2,586.4L61.4,589L36.8,624.6L50.6,648.4L85.6,656.8L103.2,644.2Z" style="fill:rgb(63,28,5);fill-rule:nonzero;stroke:rgb(63,28,5);stroke-width:1px;"/>
            <path d="M78.2,586.4L96.4,548.8L70.2,511.4L63.4,510L22,549.4L61.4,589L78.2,586.4Z" style="fill:rgb(211,152,152);fill-rule:nonzero;stroke:rgb(211,152,152);stroke-width:1px;"/>
            <path d="M113.8,478.4L114.6,470.6L87.4,440.4L61.2,440.8L40.8,479.8L63.4,510L70.2,511.4L113.8,478.4Z" style="fill:rgb(205,162,199);fill-rule:nonzero;stroke:rgb(205,162,199);stroke-width:1px;"/>
            <path d="M87.4,440.4L110.6,396L100.4,378.4L60,374.6L40.4,415.2L61.2,440.8L87.4,440.4Z" style="fill:rgb(211,152,152);fill-rule:nonzero;stroke:rgb(211,152,152);stroke-width:1px;"/>
            <path d="M116,344.4L95,315.8L62,317.4L45.6,352.2L60,374.6L100.4,378.4L116,344.4Z" style="fill:rgb(157,201,214);fill-rule:nonzero;stroke:rgb(157,201,214);stroke-width:1px;"/>
            <path d="M95,315.8L111.4,283.6L96.6,256.2L62.4,252L43.6,291.8L62,317.4L95,315.8Z" style="fill:rgb(205,162,199);fill-rule:nonzero;stroke:rgb(205,162,199);stroke-width:1px;"/>
            <path d="M144.6,278.6L147.4,261.2L118,234.2L96.6,256.2L111.4,283.6L144.6,278.6Z" style="fill:rgb(74,228,88);fill-rule:nonzero;stroke:rgb(74,228,88);stroke-width:1px;"/>
            <path d="M118,234.2L118.4,214.2L97.6,193L62.2,199.4L50.2,232.4L62.4,252L96.6,256.2L118,234.2Z" style="fill:rgb(211,152,152);fill-rule:nonzero;stroke:rgb(211,152,152);stroke-width:1px;"/>
            <path d="M97.6,193L106.4,157.2L72.4,123.6L65,123.4L40.2,173.4L62.2,199.4L97.6,193Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M108.8,88.2L103.4,59.2L63.8,45.6L53.2,53.6L50.8,111.4L65,123.4L72.4,123.6L108.8,88.2Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M129.6,34.6L129.2,0L64,0L63.8,45.6L103.4,59.2L129.6,34.6Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M107.6,707L87.8,695.8L53.4,709L48,760L110.4,760L107.6,707Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M141.4,691L138.8,662.6L103.2,644.2L85.6,656.8L87.8,695.8L107.6,707L141.4,691Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M156.6,589L157,588.4L133.2,545L96.4,548.8L78.2,586.4L105,611L156.6,589Z" style="fill:rgb(171,207,234);fill-rule:nonzero;stroke:rgb(171,207,234);stroke-width:1px;"/>
            <path d="M133.2,545L147.8,518.4L113.8,478.4L70.2,511.4L96.4,548.8L133.2,545Z" style="fill:rgb(205,162,199);fill-rule:nonzero;stroke:rgb(205,162,199);stroke-width:1px;"/>
            <path d="M152.6,448.4L150.2,404.8L110.6,396L87.4,440.4L114.6,470.6L152.6,448.4Z" style="fill:rgb(211,152,152);fill-rule:nonzero;stroke:rgb(211,152,152);stroke-width:1px;"/>
            <path d="M163.4,394.4L166.4,357.6L151,341L116,344.4L100.4,378.4L110.6,396L150.2,404.8L163.4,394.4Z" style="fill:rgb(171,207,234);fill-rule:nonzero;stroke:rgb(171,207,234);stroke-width:1px;"/>
            <path d="M151,341L161.6,300.4L144.6,278.6L111.4,283.6L95,315.8L116,344.4L151,341Z" style="fill:rgb(203,149,163);fill-rule:nonzero;stroke:rgb(203,149,163);stroke-width:1px;"/>
            <path d="M205.4,297L217.2,262.6L192.4,234.8L147.4,261.2L144.6,278.6L161.6,300.4L205.4,297Z" style="fill:rgb(123,151,75);fill-rule:nonzero;stroke:rgb(123,151,75);stroke-width:1px;"/>
            <path d="M192.4,234.8L194.2,224.6L165,191.4L118.4,214.2L118,234.2L147.4,261.2L192.4,234.8Z" style="fill:rgb(123,151,75);fill-rule:nonzero;stroke:rgb(123,151,75);stroke-width:1px;"/>
            <path d="M165,191.4L167.8,167L143.4,145.4L106.4,157.2L97.6,193L118.4,214.2L165,191.4Z" style="fill:rgb(205,162,199);fill-rule:nonzero;stroke:rgb(205,162,199);stroke-width:1px;"/>
            <path d="M143.4,145.4L148.2,106.2L108.8,88.2L72.4,123.6L106.4,157.2L143.4,145.4Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M168.4,94L172.8,59.8L129.6,34.6L103.4,59.2L108.8,88.2L148.2,106.2L168.4,94Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M164,705L141.4,691L107.6,707L110.4,760L162.6,760L164,705Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M173.4,634.8L156.6,589L105,611L103.2,644.2L138.8,662.6L173.4,634.8Z" style="fill:rgb(63,28,5);fill-rule:nonzero;stroke:rgb(63,28,5);stroke-width:1px;"/>
            <path d="M196.4,570.6L202,540.2L169.8,513.4L147.8,518.4L133.2,545L157,588.4L196.4,570.6Z" style="fill:rgb(171,207,234);fill-rule:nonzero;stroke:rgb(171,207,234);stroke-width:1px;"/>
            <path d="M169.8,513.4L189,467.2L152.6,448.4L114.6,470.6L113.8,478.4L147.8,518.4L169.8,513.4Z" style="fill:rgb(211,152,152);fill-rule:nonzero;stroke:rgb(211,152,152);stroke-width:1px;"/>
            <path d="M232.2,365.2L215.2,346.2L166.4,357.6L163.4,394.4L215.6,412.6L232.2,365.2Z" style="fill:rgb(203,149,163);fill-rule:nonzero;stroke:rgb(203,149,163);stroke-width:1px;"/>
            <path d="M215.2,346.2L219.4,312.2L205.4,297L161.6,300.4L151,341L166.4,357.6L215.2,346.2Z" style="fill:rgb(204,54,54);fill-rule:nonzero;stroke:rgb(204,54,54);stroke-width:1px;"/>
            <path d="M254,298.6L234,259.6L217.2,262.6L205.4,297L219.4,312.2L254,298.6Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M234,259.6L243.8,230.8L220.4,214.2L194.2,224.6L192.4,234.8L217.2,262.6L234,259.6Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M220.4,214.2L234.6,175.6L203,151.6L167.8,167L165,191.4L194.2,224.6L220.4,214.2Z" style="fill:rgb(203,149,163);fill-rule:nonzero;stroke:rgb(203,149,163);stroke-width:1px;"/>
            <path d="M203,151.6L208.2,115.4L168.4,94L148.2,106.2L143.4,145.4L167.8,167L203,151.6Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M198.2,42.8L199.2,0L129.2,0L129.6,34.6L172.8,59.8L198.2,42.8Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M219,706.2L198.8,694L164,705L162.6,760L219.6,760L219,706.2Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M198.8,694L203.2,644.4L173.4,634.8L138.8,662.6L141.4,691L164,705L198.8,694Z" style="fill:rgb(63,28,5);fill-rule:nonzero;stroke:rgb(63,28,5);stroke-width:1px;"/>
            <path d="M206.6,642.8L231.4,601L231.4,599.4L196.4,570.6L157,588.4L156.6,589L173.4,634.8L203.2,644.4L206.6,642.8Z" style="fill:rgb(123,151,75);fill-rule:nonzero;stroke:rgb(123,151,75);stroke-width:1px;"/>
            <path d="M235.8,524.8L236.8,487.2L192.6,466L189,467.2L169.8,513.4L202,540.2L235.8,524.8Z" style="fill:rgb(203,149,163);fill-rule:nonzero;stroke:rgb(203,149,163);stroke-width:1px;"/>
            <path d="M192.6,466L217,415.6L215.6,412.6L163.4,394.4L150.2,404.8L152.6,448.4L189,467.2L192.6,466Z" style="fill:rgb(203,149,163);fill-rule:nonzero;stroke:rgb(203,149,163);stroke-width:1px;"/>
            <path d="M261.4,363.4L278,341L266.2,304.6L254,298.6L219.4,312.2L215.2,346.2L232.2,365.2L261.4,363.4Z" style="fill:rgb(204,54,54);fill-rule:nonzero;stroke:rgb(204,54,54);stroke-width:1px;"/>
            <path d="M267.2,214.6L250.4,173.4L234.6,175.6L220.4,214.2L243.8,230.8L267.2,214.6Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M233,101.6L231.8,61.2L198.2,42.8L172.8,59.8L168.4,94L208.2,115.4L233,101.6Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M254.8,691.6L247.8,652L206.6,642.8L203.2,644.4L198.8,694L219,706.2L254.8,691.6Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M263.6,631.6L231.4,601L206.6,642.8L247.8,652L263.6,631.6Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M261.4,579.6L259.8,540.2L235.8,524.8L202,540.2L196.4,570.6L231.4,599.4L261.4,579.6Z" style="fill:rgb(162,205,164);fill-rule:nonzero;stroke:rgb(162,205,164);stroke-width:1px;"/>
            <path d="M263.6,469L253,427.8L217,415.6L192.6,466L236.8,487.2L263.6,469Z" style="fill:rgb(162,205,164);fill-rule:nonzero;stroke:rgb(162,205,164);stroke-width:1px;"/>
            <path d="M276,415.4L281.4,384.2L261.4,363.4L232.2,365.2L215.6,412.6L217,415.6L253,427.8L276,415.4Z" style="fill:rgb(157,201,214);fill-rule:nonzero;stroke:rgb(157,201,214);stroke-width:1px;"/>
            <path d="M250.4,173.4L266.8,155.2L257.6,112.8L233,101.6L208.2,115.4L203,151.6L234.6,175.6L250.4,173.4Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M263.8,41.4L265,0L199.2,0L198.2,42.8L231.8,61.2L263.8,41.4Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M272,700.2L254.8,691.6L219,706.2L219.6,760L276.6,760L272,700.2Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M311.6,686.8L312,653L274.4,628.2L263.6,631.6L247.8,652L254.8,691.6L272,700.2L311.6,686.8Z" style="fill:rgb(63,28,5);fill-rule:nonzero;stroke:rgb(63,28,5);stroke-width:1px;"/>
            <path d="M274.4,628.2L283.2,593.8L261.4,579.6L231.4,599.4L231.4,601L263.6,631.6L274.4,628.2Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M301.2,521.4L303.2,505.2L270.6,469.8L263.6,469L236.8,487.2L235.8,524.8L259.8,540.2L301.2,521.4Z" style="fill:rgb(162,205,164);fill-rule:nonzero;stroke:rgb(162,205,164);stroke-width:1px;"/>
            <path d="M301.6,439L276,415.4L253,427.8L263.6,469L270.6,469.8L301.6,439Z" style="fill:rgb(74,228,88);fill-rule:nonzero;stroke:rgb(74,228,88);stroke-width:1px;"/>
            <path d="M317.8,309.8L311.4,297.2L266.2,304.6L278,341L295.2,343.8L317.8,309.8Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M323.2,180.8L309.8,159L266.8,155.2L250.4,173.4L267.2,214.6L305.8,217.2L323.2,180.8Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M298.8,88.4L300.2,65.8L263.8,41.4L231.8,61.2L233,101.6L257.6,112.8L298.8,88.4Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M325.4,697L311.6,686.8L272,700.2L276.6,760L322.2,760L325.4,697Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M351.2,626.6L351,616.2L313,583.6L283.2,593.8L274.4,628.2L312,653L351.2,626.6Z" style="fill:rgb(63,28,5);fill-rule:nonzero;stroke:rgb(63,28,5);stroke-width:1px;"/>
            <path d="M313,583.6L324,546.6L301.2,521.4L259.8,540.2L261.4,579.6L283.2,593.8L313,583.6Z" style="fill:rgb(171,207,234);fill-rule:nonzero;stroke:rgb(171,207,234);stroke-width:1px;"/>
            <path d="M334,481.8L315.4,439.6L301.6,439L270.6,469.8L303.2,505.2L334,481.8Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M306.6,370.8L295.2,343.8L278,341L261.4,363.4L281.4,384.2L306.6,370.8Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M328.4,116.6L298.8,88.4L257.6,112.8L266.8,155.2L309.8,159L328.4,116.6Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M329.4,45.6L326.6,0L265,0L263.8,41.4L300.2,65.8L329.4,45.6Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M374,693.8L372.2,692.4L325.4,697L322.2,760L376.4,760L374,693.8Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M372.2,692.4L374.2,647.8L351.2,626.6L312,653L311.6,686.8L325.4,697L372.2,692.4Z" style="fill:rgb(63,28,5);fill-rule:nonzero;stroke:rgb(63,28,5);stroke-width:1px;"/>
            <path d="M383.6,583.4L362.6,540.4L324,546.6L313,583.6L351,616.2L383.6,583.4Z" style="fill:rgb(171,207,234);fill-rule:nonzero;stroke:rgb(171,207,234);stroke-width:1px;"/>
            <path d="M362.6,540.4L373.8,521.8L359.2,486.4L334,481.8L303.2,505.2L301.2,521.4L324,546.6L362.6,540.4Z" style="fill:rgb(203,149,163);fill-rule:nonzero;stroke:rgb(203,149,163);stroke-width:1px;"/>
            <path d="M339.8,416.8L327.6,378.2L306.6,370.8L281.4,384.2L276,415.4L301.6,439L315.4,439.6L339.8,416.8Z" style="fill:rgb(123,151,75);fill-rule:nonzero;stroke:rgb(123,151,75);stroke-width:1px;"/>
            <path d="M364.2,351.6L350.4,316L317.8,309.8L295.2,343.8L306.6,370.8L327.6,378.2L364.2,351.6Z" style="fill:rgb(204,54,54);fill-rule:nonzero;stroke:rgb(204,54,54);stroke-width:1px;"/>
            <path d="M370.8,236.2L377.8,217.2L360.2,182L323.2,180.8L305.8,217.2L326.4,243.2L370.8,236.2Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M356.4,112.2L369.6,92L360.2,60.6L329.4,45.6L300.2,65.8L298.8,88.4L328.4,116.6L356.4,112.2Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M422.6,693L427.8,653.4L417.4,639.4L374.2,647.8L372.2,692.4L374,693.8L422.6,693Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M417.4,639.4L424.4,608.8L411.8,587L383.6,583.4L351,616.2L351.2,626.6L374.2,647.8L417.4,639.4Z" style="fill:rgb(63,28,5);fill-rule:nonzero;stroke:rgb(63,28,5);stroke-width:1px;"/>
            <path d="M432.6,551.6L416,519.8L373.8,521.8L362.6,540.4L383.6,583.4L411.8,587L432.6,551.6Z" style="fill:rgb(205,162,199);fill-rule:nonzero;stroke:rgb(205,162,199);stroke-width:1px;"/>
            <path d="M383.6,459.4L368.4,421.8L339.8,416.8L315.4,439.6L334,481.8L359.2,486.4L383.6,459.4Z" style="fill:rgb(123,151,75);fill-rule:nonzero;stroke:rgb(123,151,75);stroke-width:1px;"/>
            <path d="M395.8,394.6L376.4,355.2L364.2,351.6L327.6,378.2L339.8,416.8L368.4,421.8L395.8,394.6Z" style="fill:rgb(157,201,214);fill-rule:nonzero;stroke:rgb(157,201,214);stroke-width:1px;"/>
            <path d="M364,296.4L359,281.8L327.2,272.4L311.4,297.2L317.8,309.8L350.4,316L364,296.4Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M374.8,244L370.8,236.2L326.4,243.2L327.2,272.4L359,281.8L374.8,244Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M379.4,154L356.4,112.2L328.4,116.6L309.8,159L323.2,180.8L360.2,182L379.4,154Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M405,20L405.2,0L326.6,0L329.4,45.6L360.2,60.6L405,20Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M427.6,698.4L422.6,693L374,693.8L376.4,760L423.4,760L427.6,698.4Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M480,650.4L427.8,653.4L422.6,693L427.6,698.4L480,698.4L480,650.4Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M480,608.2L480,553.4L432.6,551.6L411.8,587L424.4,608.8L480,608.2Z" style="fill:rgb(211,152,152);fill-rule:nonzero;stroke:rgb(211,152,152);stroke-width:1px;"/>
            <path d="M416,519.8L430.2,494L416,463.2L383.6,459.4L359.2,486.4L373.8,521.8L416,519.8Z" style="fill:rgb(162,205,164);fill-rule:nonzero;stroke:rgb(162,205,164);stroke-width:1px;"/>
            <path d="M435.8,435.8L418,397.8L395.8,394.6L368.4,421.8L383.6,459.4L416,463.2L435.8,435.8Z" style="fill:rgb(157,201,214);fill-rule:nonzero;stroke:rgb(157,201,214);stroke-width:1px;"/>
            <path d="M443.4,373L439.6,345.4L412,326L376.4,355.2L395.8,394.6L418,397.8L443.4,373Z" style="fill:rgb(123,151,75);fill-rule:nonzero;stroke:rgb(123,151,75);stroke-width:1px;"/>
            <path d="M412,326L409.6,309.2L364,296.4L350.4,316L364.2,351.6L376.4,355.2L412,326Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M425.4,287L416.2,247.8L374.8,244L359,281.8L364,296.4L409.6,309.2L425.4,287Z" style="fill:rgb(204,54,54);fill-rule:nonzero;stroke:rgb(204,54,54);stroke-width:1px;"/>
            <path d="M423.2,235.4L414.6,216.2L377.8,217.2L370.8,236.2L374.8,244L416.2,247.8L423.2,235.4Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M414.6,216.2L430.4,178.2L414.4,153.4L379.4,154L360.2,182L377.8,217.2L414.6,216.2Z" style="fill:rgb(171,207,234);fill-rule:nonzero;stroke:rgb(171,207,234);stroke-width:1px;"/>
            <path d="M414.4,153.4L431.8,117.4L417.6,94L369.6,92L356.4,112.2L379.4,154L414.4,153.4Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M433.4,56.4L405,20L360.2,60.6L369.6,92L417.6,94L433.4,56.4Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M480,698.4L427.6,698.4L423.4,760L480,760L480,698.4Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M480,650.4L480,608.2L424.4,608.8L417.4,639.4L427.8,653.4L480,650.4Z" style="fill:rgb(222,90,59);fill-rule:nonzero;stroke:rgb(222,90,59);stroke-width:1px;"/>
            <path d="M480,494L430.2,494L416,519.8L432.6,551.6L480,553.4L480,494Z" style="fill:rgb(162,205,164);fill-rule:nonzero;stroke:rgb(162,205,164);stroke-width:1px;"/>
            <path d="M480,436.8L435.8,435.8L416,463.2L430.2,494L480,494L480,436.8Z" style="fill:rgb(171,207,234);fill-rule:nonzero;stroke:rgb(171,207,234);stroke-width:1px;"/>
            <path d="M480,379.8L443.4,373L418,397.8L435.8,435.8L480,436.8L480,379.8Z" style="fill:rgb(162,205,164);fill-rule:nonzero;stroke:rgb(162,205,164);stroke-width:1px;"/>
            <path d="M480,329.6L439.6,345.4L443.4,373L480,379.8L480,329.6Z" style="fill:rgb(74,228,88);fill-rule:nonzero;stroke:rgb(74,228,88);stroke-width:1px;"/>
            <path d="M480,329.6L480,291.8L425.4,287L409.6,309.2L412,326L439.6,345.4L480,329.6Z" style="fill:rgb(204,54,54);fill-rule:nonzero;stroke:rgb(204,54,54);stroke-width:1px;"/>
            <path d="M480,235L423.2,235.4L416.2,247.8L425.4,287L480,291.8L480,235Z" style="fill:rgb(162,205,164);fill-rule:nonzero;stroke:rgb(162,205,164);stroke-width:1px;"/>
            <path d="M480,235L480,178.8L430.4,178.2L414.6,216.2L423.2,235.4L480,235Z" style="fill:rgb(157,201,214);fill-rule:nonzero;stroke:rgb(157,201,214);stroke-width:1px;"/>
            <path d="M480,118.8L431.8,117.4L414.4,153.4L430.4,178.2L480,178.8L480,118.8Z" style="fill:rgb(242,187,71);fill-rule:nonzero;stroke:rgb(242,187,71);stroke-width:1px;"/>
            <path d="M480,50.8L433.4,56.4L417.6,94L431.8,117.4L480,118.8L480,50.8Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
            <path d="M480,50.8L480,0L405.2,0L405,20L433.4,56.4L480,50.8Z" style="fill:rgb(36,36,36);fill-rule:nonzero;stroke:rgb(36,36,36);stroke-width:1px;"/>
        </g>
    </svg>
""".trimIndent()
